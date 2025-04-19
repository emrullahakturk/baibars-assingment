package com.example.baibars.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.baibars.data.repository.FakeUavDataRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val repository = FakeUavDataRepository()

    private val _uiState = MutableStateFlow(UavUiState())
    val uiState: StateFlow<UavUiState> = _uiState.asStateFlow()

    init {
        collectMockData()
    }

    private fun collectMockData() {
        viewModelScope.launch {
            repository.uavDataFlow.collect { data ->
                _uiState.value = UavUiState(
                    batteryVoltage = "${data.batteryVoltage} V",
                    altitude = "${data.altitude} m",
                    gpsCoordinates = "${data.latitude}, ${data.longitude}",
                    flightTime = data.flightTimeFormatted
                )
            }
        }
    }
}
