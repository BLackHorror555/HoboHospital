import disease.Alcoholism
import disease.Diabetes
import disease.RunnyNose
import doctor.Endocrinologist
import doctor.Lore
import doctor.Narcologist

/**
 * Итерируемся по бомжу и лечим болезни!
 */
fun main() {
    val drunkenHobo = DrunkenHobo(mutableListOf(Alcoholism(), Diabetes(), RunnyNose()))
    val iterator = DiseaseIterator(drunkenHobo)
    
    val endocrinologist = Endocrinologist()
    val lore = Lore()
    val narcologist = Narcologist()

    endocrinologist.setNext(lore)
    lore.setNext(narcologist)

    while (iterator.hasNext()) {
        val nextDisease = iterator.next()
        endocrinologist.treat(nextDisease)
    }
}