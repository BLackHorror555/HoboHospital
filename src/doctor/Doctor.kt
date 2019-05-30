package doctor

import disease.Disease

interface Doctor {
    fun treat(sick: Disease)
    fun setNext(doctor: Doctor)
}