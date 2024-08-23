// Route 2 without Narratives

package furhatos.app.button.flow
import furhatos.app.button.flow.main.getChatCompletion
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onNoResponse
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures


val Button2 = state {
    onButton("R2_ROOM 1", key = "e") {
        chk = false
        cnt_CW = 2

        initialPrompt = "You are FurGuide, a reliable navigational assistant. You are helping a user complete the specified task then navigate through a door in a virtual environment. The room the user is in is described below, the task the user must do in that room is also described below. The user must complete the task in the room and then navigate to the next room by going through a door. If they user asks about what they need to do, tell them what the navigational instructions are. You only provide guidance to complete the task and navigational instructions and answer any doubts or queries the user may have regarding these. If the user asks a question that cannot be answered with the information given below, do not make up an answer, instead tell the user that you cannot provide that information to them." +

                "Details of the current room: The room is made of 4 white walls. 3 of the walls have a door in the middle, on the left and right of this door are potted flowers placed inside the wall. These potted flowers have grey buttons above them. One of the walls has ferns in pots and between the ferns is a yellow door. The wall on the right of the one with yellow doors, is a wall with pink potted flowers and a pink door between them. The wall on the right of the one with the pink door, has ferns potted with a blue door between them. The correct door to go through is the pink door. In the middle of the room is a large wooden conference room style table with 4 wooden chairs on around it. These tables and chairs are on a white carpet. The roof of the room has a skylight." +

                "Task for the current room: Press all the buttons that are above pink potted plants." +

                "Navigational instructions : Walk to the wall with the pink flowers, press the all buttons above the pink flowers, then walk through the pink door." +

                "Use the following step-by-step instructions to respond to user inputs. " +
                "Step 1: The user will ask a question to clarify or to clear a doubt regarding the task or the navigational instructions you have given. " +
                "Step 2: You will answer the user's question regarding the task or the navigational instructions, using only the details of the room and task given above. Use the information provided before to formulate your answer. Do not reveal the complete details of the current room. Only reveal what is necessary to provide the user with a satisfying answer."

        furhat.listen()

    }
    onButton("R2_ROOM 2", key = "f") {
        chk = false
        cnt_CW = 2

        initialPrompt = "You are FurGuide, a reliable navigational assistant. You are helping a user complete the specified task then navigate through a door in a virtual environment. The room the user is in is described below, the task the user must do in that room is also described below. The user must complete the task in the room and then navigate to the next room by going through a door. If they user asks about what they need to do, tell them what the navigational instructions are. You only provide guidance to complete the task and navigational instructions and answer any doubts or queries the user may have regarding these. If the user asks a question that cannot be answered with the information given below, do not make up an answer, instead tell the user that you cannot provide that information to them." +

                "Details of the current room: The room is made of 4 walls. In the center of the room are white chairs facing the direction of a stage. There are six chairs, 2 rows of 3 chairs. These chairs are placed on a gray carpet. The stage has a podium with a book on it. The stage is against the wall with 2 large windows, with a gray pillar separating them. On this pillar are 4 buttons. Pink, blue, orange and yellow buttons. On the left of the wall with the window is a wooden wall with a painting of the 'The Great Wave off Kanagawa' on the right side of it and a door on the left side of it. The wall on the right side of the wall with the window is another wooden wall, this wall has 2 doors with a painting of 'The Creation of Adam' between them. The correct door to go through is the one that is on the left side of the The Creation of Adam painting. This correct door is also on the right side of the stage. The wall facing opposite to the wall with the windows is has only the door in which the user has just come from." +

                "Task for the current room: Press the blue button on the pillar." +

                "Navigational instructions : Walk straight until you see the podium, click on the the blue button on the pillar behind it, turn around until you see the book on the podium then go through the first door on the left." +

                "Use the following step-by-step instructions to respond to user inputs. " +
                "Step 1: The user will ask a question to clarify or to clear a doubt regarding the task or the navigational instructions you have given. " +
                "Step 2: You will answer the user's question regarding the task or the navigational instructions, using only the details of the room and task given above. Use the information provided before to formulate your answer. Do not reveal the complete details of the current room. Only reveal what is necessary to provide the user with a satisfying answer."

        furhat.listen()

    }
    onButton("R2_ROOM 3", key = "g") {
        chk = false
        cnt_CW = 2

        initialPrompt = "You are FurGuide, a reliable navigational assistant. You are helping a user complete the specified task then navigate through a door in a virtual environment. The room the user is in is described below, the task the user must do in that room is also described below. The user must complete the task in the room and then navigate to the next room by going through a door. If they user asks about what they need to do, tell them what the navigational instructions are. You only provide guidance to complete the task and navigational instructions and answer any doubts or queries the user may have regarding these. If the user asks a question that cannot be answered with the information given below, do not make up an answer, instead tell the user that you cannot provide that information to them." +

                "Details of the current room: The room is made of 4 walls. On the wall with the door the user just entered through is a bunch of maroon and blue trapdoors on a chequered pattern. The blue trapdoors are facing down, whereas the maroon ones are flush against the wall. The middle of the room has a glass partition separating the room into two. On the first half of the room, which is closer to where the user has just entered through is a toilet and door, which is on the left side of the first half of the room, and a sink with a mirror which is on the right side of the first half of the room. The second half of the room has a door and a bathtub on the left side of the second half of the room, and a door between two plants on the right side of the second half of the room. The first half of the room has white floors while the second half has wooden floors. On the bathtub are some pink shampoo bottles. On the right of the bathtub against the wall there are gray towels and a shelf with purple and blue shampoo bottles on them." +

                "Task for the current room: Close all the blue trapdoors. They will be closed once the are flush with the wall" +

                "Navigational instructions : Turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub, turn right and go through the doors between the potted plants." +

                "Use the following step-by-step instructions to respond to user inputs. " +
                "Step 1: The user will ask a question to clarify or to clear a doubt regarding the task or the navigational instructions you have given." +
                "Step 2: You will answer the user's question regarding the task or the navigational instructions, using only the details of the room and task given above. Use the information provided before to formulate your answer. Do not reveal the complete details of the current room. Only reveal what is necessary to provide the user with a satisfying answer."

        furhat.listen()

    }
    onButton("R2_ROOM 4", key = "h") {
        chk = false
        cnt_CW = 2

        initialPrompt = "You are FurGuide, a navigational assistant. You are helping the user complete the specified task then navigate to the next room in a Minecraft environment. You only provide guidance to complete the task and navigational instructions and answer any doubts or queries the user may have regarding these. " +

                "Details of the current room: The room is made of 4 walls. There is only one door is this room, the one the user came through. The wall with the door the user just came through only has that door in the middle, with a lantern hanging on a chain above the door and some potted plants hanging on chains on the left and right of the door. The wall facing opposite to the wall with the chains and plants is a glass wall, where you can see a grassy plains area under the blue sky and white clouds. On the left of the glass wall is a gray wall with some 9 item frames on the left and two shelves with cherry blossom plants on them. The item frames have silver, gold and diamond tools on them. They are meant to be facing up on the item frame. 3 tools are not facing up. On the wall on the right of the glass wall is another gray wall with three paintings hung up on it. The painting on the left is a painting of The Scream'. The painting in the middle is the painting of 'Portrait of Madame X' and the one on the right is a painting of 'Liberty Leading the People. In the middle of the room is a chandelier with a sofa under it, the sofa is facing the glass wall. The user will stay in this room as its the final room." +

                "Task for the current room: Turn all the tools in the item frame such that they are facing up. To turn them the user must right click, then it will rotate the tool in the item frame." +

                "Navigational instructions : Walk straight until you are behind the couch, turn left until you see a wall of tools, make sure all the tools are facing up." +

                "Use the following step-by-step instructions to respond to user inputs. " +
                "Step 1: The user will ask a question to clarify or to clear a doubt regarding the task or the navigational instructions you have given. " +
                "Step 2: You will answer the user's question regarding the task or the navigational instructions, using only the details of the room and task given above. Use the information provided before to formulate your answer. Do not reveal the complete details of the current room. Only reveal what is necessary to provide the user with a satisfying answer."

        furhat.listen()

    }
    onButton("END", key = "end2") {
        furhat.say("Congratulations! You have successfully completed this route.")
    }
    onButton("PAUSE", key = "pause2") {
        furhat.stopListening()
    }

    onResponse {
//        furhat.say(initialPrompt, async = true)
        furhat.say(async = true) {
            +Gestures.GazeAway
            random {
                +"Let's see"
                +"Let me see"
                +"Okay, lets see"
                +"Let me think"
                +"Please wait a second"
                +"Wait a second"
                +"One second"
                +"Give me a second"
                +"Just a moment"
                +"Well"
                +"Okay"
                +"Alright, let me think"
                +"Hang on a moment"
            }
        }
        val robotResponse = call {
            getChatCompletion(initialPrompt)
        } as String?

        furhat.ask(robotResponse?:"Sorry, I didn't get that. Could you please repeat what you said.")
    }

    onNoResponse {
        furhat.listen()
    }

}

