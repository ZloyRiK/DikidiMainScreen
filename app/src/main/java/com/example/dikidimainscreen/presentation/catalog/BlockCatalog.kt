package com.example.dikidimainscreen.presentation.catalog

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dikidimainscreen.R
import com.example.dikidimainscreen.domain.model.CatalogData

@Composable
fun BlockCatalog() {
    val listOfExampleData = listOf(
        CatalogData(id = 0, imageId = R.drawable.hair, title = "Парикмахерские услуги"),
        CatalogData(id = 0, imageId = R.drawable.nails, "Ногтевой сервис"),
        CatalogData(id = 0, imageId = R.drawable.lashes, "Ресницы"),
        CatalogData(id = 0, imageId = R.drawable.stomatoligy, "Стоматология"),
        CatalogData(id = 0, imageId = R.drawable.fitnes, "Фитнес"),
        CatalogData(id = 0, imageId = R.drawable.barbeshop, "Барбершоп"),
        CatalogData(id = 0, imageId = R.drawable.brows, "Брови")
    )
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2), modifier = Modifier.height(160.dp)
    )
    {
        items(listOfExampleData) { item ->
            CatalogItem(catalogData = item)
        }
    }
}