// Route 1 without Narratives

package furhatos.app.button.flow
import furhatos.app.button.flow.main.Idle
import furhatos.app.button.setting.DISTANCE_TO_ENGAGE
import furhatos.app.button.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Init4: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
    }
    onEntry {
        /** start interaction */
        when {
            furhat.isVirtual() -> {
                furhat.say({
                    +"Hey there! I'm Fur Guide, your go-to guide for navigating the world! Ready for some adventure? Let's dive into your instructions, and remember, if you have any questions along the way, just give me a shout!"
                    + delay(250)
                    +"Here are the instructions."
                    + delay(250)
                    + "In the first room, walk besides the meeting table to the wall with the pink flowers. These pink flowers are tulips, I picked them from a garden and planted them because I love how they smell. Press all the buttons above the pink flowers, then walk until you see a pink door and go through it."
                    + delay(500)
                    + "In the second room, walk straight and go on stage, click on the the blue button on the pillar behind it, turn around until you see the book on the podium. The book placed on the podium was left behind by a teacher who was narrating a story to his classroom. Go through the first door on the left of the podium."
                    + delay(500)
                    + "In the third room, turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub and turn right. Go through the doors between the potted plants. These plants were given to me as a gift from one of my friends, they help keep the room look lively."
                    + delay(500)
                    + "You will now have reached the final room, in this room walk straight until you are under the chandelier. On your left, you will see a wall of tools that were used to build this very room. Make sure all the tools are facing up."
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
                    + "In the first room, walk beside the meeting table to the wall with the pink flowers. These pink flowers are tulips, I picked them from a garden and planted them because I love how they smell. Press all the buttons above the pink flowers, then walk until you see a pink door and go through it."
                    + delay(500)
                    + "In the second room, walk straight and go on stage, click on the blue button on the pillar behind it, turn around until you see the book on the podium. The book placed on the podium was left behind by a teacher who was narrating a story to his classroom. Go through the first door on the left of the podium."
                    + delay(500)
                    + "In the third room, turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub and turn right. Go through the doors between the potted plants. These plants were given to me as a gift from one of my friends, they help keep the room look lively."
                    + delay(500)
                    + "You will now have reached the final room, in this room walk straight until you are under the chandelier. On your left, you will see a wall of tools that were used to build this very room. Make sure all the tools are facing up."
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
            + "In the first room, walk beside the meeting table to the wall with the pink flowers. These pink flowers are tulips, I picked them from a garden and planted them because I love how they smell. Press the all buttons above the pink flowers, then walk until you see a pink door and go through it."
            + delay(500)
            + "In the second room, walk straight and go on stage, click on the blue button on the pillar behind it, turn around until you see the book on the podium. The book placed on the podium was left behind by a teacher who was narrating a story to his classroom. Go through the first door on the left of the podium."
            + delay(500)
            + "In the third room, turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub and turn right. Go through the doors between the potted plants. These plants were given to me as a gift from one of my friends, they help keep the room look lively."
            + delay(500)
            +"You will now have reached the final room, in this room walk straight until you are under the chandelier. On your left, you will see a wall of tools that were used to build this very room. Make sure all the tools are facing up."
            + delay(500)
        }
        furhat.ask("Would you like me to repeat again?")
    }
    onResponse<No> {
        furhat.say("Okay. You can now start")
        goto(Button4)
    }

    onResponse {
        furhat.ask("Sorry, I didn't get that. Could you please repeat?")
    }

    onNoResponse {
        furhat.ask("Sorry, would you like me to repeat?")
    }

}
