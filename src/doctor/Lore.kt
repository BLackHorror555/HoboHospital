package doctor

import disease.RunnyNose
import disease.Disease

class Lore : BaseDoctor() {
    override fun treat(disease: Disease) {
        if (disease is RunnyNose) {
            println("Runny nose was cured")
        }
        if (nextDoctor != null) {
            nextDoctor!!.treat(disease)
        }
    }

}