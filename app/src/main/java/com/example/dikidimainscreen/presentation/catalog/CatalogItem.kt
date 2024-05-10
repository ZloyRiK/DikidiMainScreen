package com.example.dikidimainscreen.presentation.catalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.dikidimainscreen.R
import com.example.dikidimainscreen.domain.model.CatalogData

@Composable
fun CatalogItem(catalogData: CatalogData) {
    Card(
        modifier = Modifier
            .padding(2.dp)
            .size(width = 150.dp, height = 72.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = catalogData.imageId),
                contentDescription = catalogData.title,
                contentScale = ContentScale.Crop,
                alpha = 0.7f
            )
            Text(
                text = catalogData.title,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}