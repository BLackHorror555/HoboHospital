package doctor

abstract class BaseDoctor : Doctor {
    var nextDoctor: Doctor? = null

    override fun setNext(doctor: Doctor) {
        nextDoctor = doctor
    }
}