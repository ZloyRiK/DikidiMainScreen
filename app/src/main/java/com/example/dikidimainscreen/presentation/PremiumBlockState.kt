package com.example.dikidimainscreen.presentation

import com.example.dikidimainscreen.domain.model.PremiumData

sealed class PremiumBlockState {
    object Initial: PremiumBlockState()

    data class BlockData(val premiumData: List<PremiumData>): PremiumBlockState()
}