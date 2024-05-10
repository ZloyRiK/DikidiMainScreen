package com.example.dikidimainscreen.data.mapper

import android.util.Log
import com.example.dikidimainscreen.data.model.DikidiServerResponse
import com.example.dikidimainscreen.domain.model.PremiumData

class DikidiServerResponseMapper {

    fun responseToPremiumList(response: DikidiServerResponse): List<PremiumData>{
        val result = mutableListOf<PremiumData>()
        val listItems = response.data.blocks.catalog
        for(item in listItems){
            val premiumData = PremiumData(
                id = item.id,
                imageUrl = item.image.origin,
                title = item.name
            )
            Log.d("MyLog", premiumData.toString())
            result.add(premiumData)
        }

        return result
    }
}