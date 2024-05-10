package com.example.dikidimainscreen.presentation.premium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.dikidimainscreen.R
import com.example.dikidimainscreen.domain.model.PremiumData

@Composable
fun PremiumCardItem(premiumData: PremiumData) {
    Card(modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(0.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = premiumData.imageUrl,
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Column(modifier = Modifier
                .weight(1f)
                .padding(start = 15.dp)) {
                Text(text = premiumData.title, maxLines = 2)
                Text(text = "Example description", maxLines = 2)
            }
            OutlinedButton(onClick = { /*TODO*/ }, shape = RoundedCornerShape(8.dp)) {
                Text(text = stringResource(R.string.appointment))
            }
        }
    }
}