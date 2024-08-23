// Route 1 without Narratives

package furhatos.app.button.flow
import furhatos.app.button.flow.main.Idle
import furhatos.app.button.setting.DISTANCE_TO_ENGAGE
import furhatos.app.button.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Init: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
    }
    onEntry {
        /** start interaction */
        when {
            furhat.isVirtual() -> {
                furhat.say({
                    +"Hi there! I am Fur Guide, an advanced navigational assistant. I will now give you your instructions. Please don't hesitate to ask me any questions if you're stuck!"
                    + delay(250)
                    +"Here are the instructions."
                    + delay(250)
                    + "In the first room, pull the lever down above the door on the green wall, then walk until you see the book shelf and blue flowers. Go through the door between them."
                    + delay(500)
                    + "In the second room, walk until you see the blue wall with the buttons, press all the yellow buttons. Then walk past the cactus plants and go through the door on the yellow wall."
                    + delay(500)
                    + "In the third room, walk until you see the maroon and yellow trapdoors, ensure all the trapdoors are closed, then walk through the door on the left of the fireplace."
                    + delay(500)
                    + "You will now have reached the final room, in this room walk until you face the fountain, turn left and press the button above the vase with the heart on it."
                    + delay(1000)})

                furhat.ask("Would you like me to repeat these instructions?")

            } // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                furhat.say({
                    +"Hi there! I am Fur Guide, an advanced navigational assistant. I will now give you your instructions. Please don't hesitate to ask me any questions if you're stuck!"
                    + delay(250)
                    +"Here are the instructions."
                    + delay(250)
                    + "In the first room, pull the lever down above the door on the green wall, then walk until you see the book shelf and blue flowers. Go through the door between them."
                    + delay(500)
                    + "In the second room, walk until you see the blue wall with the buttons, press all the yellow buttons. Then walk past the cactus plants and go through the door on the yellow wall."
                    + delay(500)
                    + "In the third room, walk until you see the maroon and yellow trapdoors, ensure all the trapdoors are closed, then walk through the door on the left of the fireplace."
                    + delay(500)
                    + "You will now have reached the final room, in this room walk until you face the fountain, turn left and press the button above the vase with the heart on it."
                    + delay(1000)})

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
            + "In the first room, pull the lever down above the door on the green wall, then walk until you see the book shelf and blue flowers. Go through the door between them."
            + delay(500)
            + "In the second room, walk until you see the blue wall with the buttons, press all the yellow buttons. Then walk past the cactus plants and go through the door on the yellow wall."
            + delay(500)
            + "In the third room, walk until you see the maroon and yellow trapdoors, ensure all the trapdoors are closed, then walk through the door on the left of the fireplace."
            + delay(500)
            + "You will now have reached the final room, in this room walk until you face the fountain, turn left and press the button above the vase with the heart on it."
            + delay(1000)
        }
        furhat.ask("Would you like me to repeat again?")
    }
    onResponse<No> {
        furhat.say("Okay. You can now start moving")
        goto(Button)
    }

    onResponse {
        furhat.ask("Sorry, I didn't get that. Could you please repeat?")
    }

    onNoResponse {
        furhat.ask("Sorry, would you like me to repeat?")
    }

}
