// Route 1 with Narratives

package furhatos.app.button.flow
import furhatos.app.button.flow.main.Idle
import furhatos.app.button.setting.DISTANCE_TO_ENGAGE
import furhatos.app.button.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes



val Init3: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
    }
    onEntry {
        /** start interaction */
        when {
            furhat.isVirtual() -> {
                furhat.say({
                    +"Hey there!  I'm Fur Guide, your go-to guide for navigating the world! Ready for some adventure? Let's dive into your instructions, and remember, if you have any questions along the way, just give me a shout!"
                    + delay(250)
                    +"Here are the instructions."
                    + delay(250)
                    + "In the first room, walk until you see some stacks of TNT, these TNTs were left here by some miners after an excavation. Pull the lever down above the door to the right of the TNT, then walk until you see the book shelf and blue orchids. This bookshelf contains some of the rarest books ever written! Go through the door between them"
                    + delay(500)
                    + "In the second room, walk between the sofa and the TV until you are at the blue wall. The TV has been playing all day and has been finally turned off. Press all the yellow buttons on the wall. Walk back past the cactus plants. Be careful because the cactus plants are quite sharp and could leave you with cuts. Then go through the door on the left next to the painting."
                    + delay(500)
                    + "In the third room, walk until you see the maroon and yellow trapdoors, ensure all the trapdoors are closed, then walk until you see the fireplace. Although the room has been recently renovated, the fireplace has been left untouched and has been here since the eighties. Walk through the door on the left of the fireplace."
                    + delay(500)
                    +"You will now have reached the final room, walk until you face the fountain. On your left, you should see a set of three clay pots that are from 5th century Egypt. Each has a symbol inscribed on them. Press the button above the pot with the heart symbol on it, which represents eternal life and resurrection."
                    + delay(500)})


                furhat.ask("Would you like me to repeat these instructions?")

            } // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                furhat.say({
                    +"Hey there! I'm Fur Guide, your go-to guide for navigating the world! Ready for some adventure? Let's dive into your instructions, and remember, if you have any questions along the way, just give me a shout!"
                    + delay(250)
                    +"Here are the instructions."
                    + delay(250)
                    + "In the first room, walk until you see some stacks of TNT, these TNTs were left here by some miners after an excavation. Pull the lever down above the door to the right of the TNT, then walk until you see the book shelf and blue orchids. This bookshelf contains some of the rarest books ever written! Go through the door between them"
                    + delay(500)
                    + "In the second room, walk between the sofa and the TV until you are at the blue wall. The TV has been playing all day and has been finally turned off. Press all the yellow buttons on the wall. Walk back past the cactus plants. Be careful because the cactus plants are quite sharp and could leave you with cuts. Then go through the door on the left next to the painting."
                    + delay(500)
                    + "In the third room, walk until you see the maroon and yellow trapdoors, ensure all the trapdoors are closed, then walk until you see the fireplace. Although the room has been recently renovated, the fireplace has been left untouched and has been here since the eighties. Walk through the door on the left of the fireplace."
                    + delay(500)
                    +"You will now have reached the final room, walk until you face the fountain. On your left, you should see a set of three clay pots that are from 5th century Egypt. Each has a symbol inscribed on them. Press the button above the pot with the heart symbol on it, which represents eternal life and resurrection."
                    + delay(500)})


                furhat.ask("Would you like me to repeat these instructions?")
            }
            else -> {
                goto(Idle)
            }
        }
    }

    onResponse<Yes> {
        furhat.say {
            +"Sure."
            +delay(250)
            +"Here are the instructions."
            + delay(250)
            + "In the first room, walk until you see some stacks of TNT, these TNTs were left here by some miners after an excavation. Pull the lever down above the door to the right of the TNT, then walk until you see the book shelf and blue orchids. This bookshelf contains some of the rarest books ever written! Go through the door between them"
            + delay(500)
            + "In the second room, walk between the sofa and the TV until you are at the blue wall. The TV has been playing all day and has been finally turned off. Press all the yellow buttons on the wall. Walk back past the cactus plants. Be careful because the cactus plants are quite sharp and could leave you with cuts. Then go through the door on the left next to the painting."
            + delay(500)
            + "In the third room, walk until you see the maroon and yellow trapdoors, ensure all the trapdoors are closed, then walk until you see the fireplace. Although the room has been recently renovated, the fireplace has been left untouched and has been here since the eighties. Walk through the door on the left of the fireplace."
            + delay(500)
            +"You will now have reached the final room, walk until you face the fountain. On your left, you should see a set of three clay pots that are from 5th century Egypt. Each has a symbol inscribed on them. Press the button above the pot with the heart symbol on it, which represents eternal life and resurrection."
            + delay(500)
        }
        furhat.ask("Would you like me to repeat again?")
    }
    onResponse<No> {
        furhat.say("Okay. You can now start")
        goto(Button3)
    }

    onResponse {
        furhat.ask("Sorry, I didn't get that. Could you please repeat?")
    }

    onNoResponse {
        furhat.ask("Sorry, would you like me to repeat?")
    }

}
