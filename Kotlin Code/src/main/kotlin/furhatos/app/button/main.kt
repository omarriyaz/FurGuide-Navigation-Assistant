package furhatos.app.button

import furhatos.app.button.flow.*
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class ButtonSkill : Skill() {
    override fun start() {

        //Flow().run(Button)
        //Flow().run(Button2)
        //Flow().run(Button3)
        //Flow().run(Button4)

        //Flow().run(Init)
        //Flow().run(Init2)
        //Flow().run(Init3)
        //Flow().run(Init4)


        Flow().run(Choices)

    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
