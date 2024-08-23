package furhatos.app.button.flow


import furhatos.app.button.flow.main.Idle
import furhatos.app.button.setting.DISTANCE_TO_ENGAGE
import furhatos.app.button.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Choices: State = state {

    onButton("Non Narrative_R1", key = "a") {
        goto(Init)
    }

    onButton("Non Narrative_R2", key = "b") {
        goto(Init2)
    }

    onButton("Narrative_R1", key = "c") {
        goto(Init3)
    }

    onButton("Narrative_R2", key = "d") {
        goto(Init4)
    }

    onButton("Demo", key = "f") {
        goto(Demo)
    }

}
