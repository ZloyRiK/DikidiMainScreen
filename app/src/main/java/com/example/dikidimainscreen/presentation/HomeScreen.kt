package com.example.dikidimainscreen.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dikidimainscreen.presentation.catalog.BlockCatalog
import com.example.dikidimainscreen.presentation.premium.BlockPremium
import com.example.dikidimainscreen.presentation.promotion.BlockPromo

@Composable
fun HomeScreen(viewModel: MainScreenViewModel, paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(8.dp)
            .fillMaxSize()
            .wrapContentHeight()
            .verticalScroll(rememberScrollState())
    ) {
        Text(text = "Категории", style = TextStyle(fontSize = 20.sp))
        Spacer(modifier = Modifier.height(16.dp))
        BlockCatalog()
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Премиум", style = TextStyle(fontSize = 20.sp))
        Spacer(modifier = Modifier.size(16.dp))
        BlockPremium()
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = "Акции", style = TextStyle(fontSize = 20.sp))
        Spacer(modifier = Modifier.size(16.dp))
        BlockPromo()
    }
}