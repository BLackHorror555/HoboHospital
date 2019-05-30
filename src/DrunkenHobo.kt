import disease.Disease

class DrunkenHobo(val diseasesList: MutableList<Disease>) : Sick {
    override fun getDiseases(): MutableList<Disease> {
        return diseasesList
    }
}