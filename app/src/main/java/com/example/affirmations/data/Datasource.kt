package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.plant1),
            Affirmation(R.string.affirmation2, R.drawable.plant2),
            Affirmation(R.string.affirmation3, R.drawable.plant3),
            Affirmation(R.string.affirmation4, R.drawable.plant1),
            Affirmation(R.string.affirmation5, R.drawable.plant2),
            Affirmation(R.string.affirmation6, R.drawable.plant3),
            Affirmation(R.string.affirmation7, R.drawable.plant1),
            Affirmation(R.string.affirmation8, R.drawable.plant2),
            Affirmation(R.string.affirmation9, R.drawable.plant3),
            Affirmation(R.string.affirmation10, R.drawable.plant1)
        )
    }
}