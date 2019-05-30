import disease.Disease

interface Sick {
    fun getDiseases() : MutableList<Disease>
}