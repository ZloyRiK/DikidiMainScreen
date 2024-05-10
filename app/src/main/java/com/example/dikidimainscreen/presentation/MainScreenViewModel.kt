package com.example.dikidimainscreen.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dikidimainscreen.data.ApiFactory
import com.example.dikidimainscreen.navigation.BottomNavigationItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainScreenViewModel: ViewModel() {

    private val _selectedNavItem = MutableLiveData<BottomNavigationItem>(BottomNavigationItem.Home)
    val selectedNavItem: LiveData<BottomNavigationItem> = _selectedNavItem

    private val compositeDisposable = CompositeDisposable()

    fun selectNavItem(navigationItem: BottomNavigationItem){
        _selectedNavItem.value = navigationItem
    }
    fun loadData() {
        val disposable = ApiFactory.apiService.getExampleData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("MyLog", "Before use DikidiServerResponse")
                Log.d("MyLog", "Error cod from response ${it.serverError.code}")
            }, {
                Log.d("MyLog", "Without use DikidiServerResponse")
                Log.d("MyLog", "trow massage ${it.message}")
            })

        compositeDisposable.add(disposable)
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }
}