package com.example.dikidimainscreen.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dikidimainscreen.data.api.ApiFactory
import com.example.dikidimainscreen.data.mapper.DikidiServerResponseMapper
import com.example.dikidimainscreen.domain.model.PremiumData
import kotlinx.coroutines.launch
import okhttp3.internal.wait

class MainScreenViewModel : ViewModel() {

    private val mapper = DikidiServerResponseMapper()

    private val _premiumBlockState = MutableLiveData<PremiumBlockState>(PremiumBlockState.Initial)
    val premiumBlockState: LiveData<PremiumBlockState> = _premiumBlockState

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            val response = ApiFactory.apiService.getExampleDataByCity("city_id=468902")
            _premiumBlockState.value = PremiumBlockState.BlockData(mapper.responseToPremiumList(response))
        }
    }

}