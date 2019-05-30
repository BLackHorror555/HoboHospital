import disease.Disease

class DiseaseIterator(val sick: Sick) : Iterator<Disease> {

    var position: Int = 0


    override fun hasNext(): Boolean {
        return sick.getDiseases().lastIndex >= position
    }

    override fun next(): Disease {
        return sick.getDiseases()[position++]
    }

}