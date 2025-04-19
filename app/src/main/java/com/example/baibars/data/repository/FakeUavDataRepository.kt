package com.example.baibars.data.repository

import com.example.baibars.data.model.UavData
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class FakeUavDataRepository {

    val uavDataFlow: Flow<UavData> = flow {
        var time = 0
        while (true) {
            delay(1000L)  // her 1 saniyede bir veri gönder
            emit(
                UavData(
                    batteryVoltage = Random.nextDouble(15.0, 16.8).toFloat(),
                    altitude = Random.nextInt(100, 200),
                    latitude = 41.0 + Random.nextDouble(0.001, 0.009),
                    longitude = 28.9 + Random.nextDouble(0.001, 0.009),
                    flightTimeSeconds = time++
                )
            )
        }
    }
}
