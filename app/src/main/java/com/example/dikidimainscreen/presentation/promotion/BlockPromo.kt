package com.example.dikidimainscreen.presentation.promotion

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.dikidimainscreen.R
import com.example.dikidimainscreen.domain.testdata.PromoData

@Composable
fun BlockPromo(){
    val listOfPromo = listOf(
        PromoData(imageId = R.drawable.promo_1, companyName = "Company 1", promoDescription = "Descroption of promo 1", address = "Test city"),
        PromoData(imageId = R.drawable.promo_2, companyName = "Company 2", promoDescription = "Descroption of promo 2", address = "Test city"),
        PromoData(imageId = R.drawable.promo_3, companyName = "Company 3", promoDescription = "Descroption of promo 3", address = "Test city")
    )
    LazyRow() {
        items(listOfPromo){item ->
            PromoItem(item)
        }
    }
}