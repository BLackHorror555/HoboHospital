package doctor

import disease.Alcoholism
import disease.Disease

class Narcologist : BaseDoctor() {
    override fun treat(disease: Disease) {
        if (disease is Alcoholism) {
            println("Alcoholism was cured")
        }
        if (nextDoctor != null) {
            nextDoctor!!.treat(disease)
        }
    }
}