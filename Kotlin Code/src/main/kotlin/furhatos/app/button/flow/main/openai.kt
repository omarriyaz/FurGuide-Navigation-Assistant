package furhatos.app.button.flow.main

import com.theokanning.openai.completion.CompletionRequest
import com.theokanning.openai.completion.chat.ChatCompletionRequest
import com.theokanning.openai.completion.chat.ChatMessage
import com.theokanning.openai.service.OpenAiService
import furhatos.app.button.flow.cnt_CW
import furhatos.flow.kotlin.DialogHistory
import furhatos.flow.kotlin.Furhat

val service = OpenAiService("OPENAIAPIKEY")

fun getDialogCompletion(initialPrompt: String): String? {
    val agentName = "Robot"
    val description = "The following is a conversation between a $agentName and a Human. The $agentName is friendly and helpful."
    val contextWindowSize = 10
    val history = Furhat.dialogHistory.all.takeLast(contextWindowSize).mapNotNull {
        when (it) {
            is DialogHistory.ResponseItem -> {
                "Human: ${it.response.text}"
            }
            is DialogHistory.UtteranceItem -> {
                "$agentName: ${it.toText()}"
            }
            else -> null
        }
    }.joinToString(separator = "\n")
    val prompt = "$description\n$initialPrompt\n\n$history\n$agentName:"
    val completionRequest = CompletionRequest.builder()
        .temperature(0.9)
        .maxTokens(50)
        .topP(1.0)
        .frequencyPenalty(0.0)
        .presencePenalty(0.6)
        .prompt(prompt)
        .stop(listOf("$agentName:", "Human:"))
        .echo(false)
        .model("gpt-3.5-turbo")
        .build();
    try {
        val completion = service.createCompletion(completionRequest).choices.first().text
        return completion.trim()
    } catch (e: Exception) {
        println("Problem with connection to OpenAI")
    }
    return null
}

fun getChatCompletion(initialPrompt: String): String? {
    val contextWindowSize = cnt_CW // TODO continuously update this to use only the conversation history of the current room, and ignore conversation of previous rooms
//    val instruction = "You are a friendly and helpful social robot. Your name is Furhat. You give very brief answers."

    val messages = mutableListOf(ChatMessage().apply { role = "system"; content = initialPrompt })
    Furhat.dialogHistory.all.takeLast(contextWindowSize).forEach {
        when (it) {
            is DialogHistory.ResponseItem -> {
                messages.add(ChatMessage().apply { role = "user"; content = it.response.text })
            }
            is DialogHistory.UtteranceItem -> {
                messages.add(ChatMessage().apply { role = "assistant"; content = it.toText() })
            }
            else -> null
        }
    }
    val completionRequest = ChatCompletionRequest.builder()
        .messages(messages)
        .model("gpt-3.5-turbo")
        .build()
    try {
        val completion = service.createChatCompletion(completionRequest).choices.first().message.content
        return completion.trim()
    } catch (e: Exception) {
        println("Problem with connection to OpenAI")
    }
    return null
}