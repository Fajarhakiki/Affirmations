package trpl.nim234311039.affirmations.data

import trpl.nim234311039.affirmations.model.Affirmation
import trpl.nim234311039.affirmations.R

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(R.string.affirmation1, R.drawable.freddy_krueger),
            Affirmation(R.string.affirmation2, R.drawable.jason),
            Affirmation(R.string.affirmation3, R.drawable.leatherface),
            Affirmation(R.string.affirmation4, R.drawable.michael_myers),
            Affirmation(R.string.affirmation5, R.drawable.terrifier)
        )
    }
}