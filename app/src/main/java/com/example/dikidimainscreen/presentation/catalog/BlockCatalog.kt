package com.example.dikidimainscreen.presentation.catalog

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dikidimainscreen.R
import com.example.dikidimainscreen.domain.testdata.CatalogData

@Preview
@Composable
fun BlockCatalog() {
    val listOfCatalogItems = listOf(
        CatalogData(R.drawable.hair, "Парикмахерские услуги"),
        CatalogData(R.drawable.nails, "Ногтевой сервис"),
        CatalogData(R.drawable.lashes, "Ресницы"),
        CatalogData(R.drawable.stomatoligy, "Стоматология"),
        CatalogData(R.drawable.fitnes, "Фитнес"),
        CatalogData(R.drawable.barbeshop, "Барбершоп"),
        CatalogData(R.drawable.brows, "Брови")
    )
    LazyHorizontalGrid(rows = GridCells.Fixed(2), modifier = Modifier.height(160.dp)
        )
    {
        items(listOfCatalogItems) { item ->
            CatalogItem(catalogData = item)
        }
    }
}