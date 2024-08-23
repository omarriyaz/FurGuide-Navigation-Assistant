package furhatos.app.button.flow

import furhatos.app.button.flow.main.Idle
import furhatos.app.button.setting.DISTANCE_TO_ENGAGE
import furhatos.app.button.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Demo: State = state {

    onEntry {
        furhat.ask({
            +"Hi there! I am Fur Guide, an advanced navigational assistant."
            +delay(500)
            +"How can I help?"})
    }

    onResponse<No> {
        furhat.say("Okay")
        goto(Choices)
    }

    onResponse {
        furhat.ask({
            +"I am doing great!"
            +delay(250)
            +"Is there anything that I can help with?"})
    }

    onNoResponse {
        furhat.ask("Sorry, I didn't get that. Could you please repeat?")
    }

}
