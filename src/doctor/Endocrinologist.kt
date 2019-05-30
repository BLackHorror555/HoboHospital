package doctor

import disease.Diabetes
import disease.Disease

class Endocrinologist : BaseDoctor() {
    override fun treat(disease: Disease) {
        if (disease is Diabetes) {
            println("Diabetes was cured")
        }
        if (nextDoctor != null) {
            nextDoctor!!.treat(disease)
        }
    }
}