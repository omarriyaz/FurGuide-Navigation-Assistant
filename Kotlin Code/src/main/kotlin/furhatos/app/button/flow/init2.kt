// Route 2 without Narratives

package furhatos.app.button.flow
import furhatos.app.button.flow.main.Idle
import furhatos.app.button.setting.DISTANCE_TO_ENGAGE
import furhatos.app.button.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Init2: State = state {
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
                    + "In the first room, walk to the wall with the pink flowers, press all the buttons above the pink flowers, then walk until you see a pink door and go through it."
                    + delay(250)
                    + "In the second room, walk straight until you see the podium, click on the the blue button on the pillar behind it, turn around until you see the book on the podium then go through the first door on the left."
                    + delay(250)
                    + "In the third room, turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub, turn right and go through the doors between the potted plants."
                    + delay(250)
                    + "You will now have reached the final room, in this room walk straight until you are behind the couch, turn left until you see a wall of tools, make sure all the tools are facing up."
                    + delay(500)})

                furhat.ask("Would you like me to repeat?")

            } // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                furhat.say({
                    +"Hi there! I am Fur Guide, an advanced navigational assistant. I will now give you your instructions. Please don't hesitate to ask me any questions if you're stuck!"
                    + delay(250)
                    +"Here are the instructions."
                    + delay(250)
                    + "In the first room, walk to the wall with the pink flowers, press all the buttons above the pink flowers, then walk until you see a pink door and go through it."
                    + delay(250)
                    + "In the second room, walk straight until you see the podium, click on the the blue button on the pillar behind it, turn around until you see the book on the podium then go through the first door on the left."
                    + delay(250)
                    + "In the third room, turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub, turn right and go through the doors between the potted plants."
                    + delay(250)
                    + "You will now have reached the final room, in this room walk straight until you are behind the couch, turn left until you see a wall of tools, make sure all the tools are facing up."
                    + delay(500)})

                furhat.ask("Would you like me to repeat?")
            }
            else -> goto(Idle)
        }
    }

    onResponse<Yes> {
        furhat.say {
            +"Sure."
            +delay(250)
            +"Here are the instructions."
            + delay(250)
            + "In the first room, walk to the wall with the pink flowers, press all the buttons above the pink flowers, then walk until you see a pink door and go through it."
            + delay(250)
            + "In the second room, walk straight until you see the podium, click on the the blue button on the pillar behind it, turn around until you see the book on the podium then go through the first door on the left."
            + delay(250)
            + "In the third room, turn left at the sink, close all the blue trapdoors, then walk until you see a bathtub, turn right and go through the doors between the potted plants."
            + delay(250)
            + "You will now have reached the final room, in this room walk straight until you are behind the couch, turn left until you see a wall of tools, make sure all the tools are facing up."
            + delay(500)
        }
        furhat.ask("Would you like me to repeat?")
    }
    onResponse<No> {
        furhat.say("Okay. You can now start")
        goto(Button2)
    }

    onResponse {
        furhat.ask("Sorry, I didn't get that. Could you please repeat?")
    }

    onNoResponse {
        furhat.ask("Sorry, would you like me to repeat?")
    }

}
