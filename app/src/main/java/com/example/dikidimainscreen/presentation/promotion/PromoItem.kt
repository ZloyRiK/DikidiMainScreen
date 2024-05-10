package com.example.dikidimainscreen.presentation.promotion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.dikidimainscreen.R
import com.example.dikidimainscreen.domain.model.PromoData

@Composable
fun PromoItem(promoData: PromoData) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Box(modifier = Modifier.size(height = 150.dp, width = 350.dp)) {
            Image(
                painter = painterResource(id = promoData.imageId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )

        }
        Column(modifier = Modifier.padding(15.dp)) {
            Text(
                text = promoData.promoDescription,
                maxLines = 2,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Image(
                    painter = painterResource(id = R.drawable.post_comunity_thumbnail),
                    contentDescription = "Shop logo",
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp),
                    verticalArrangement = Arrangement.Center) {
                    Text(text = promoData.companyName, fontWeight = FontWeight.Bold)
                    Text(text = promoData.address)
                }
            }
        }
    }
}