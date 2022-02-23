package com.example.outsideintddexample.acceptancetests

import com.example.outsideintddexample.Car
import junit.framework.TestCase
import junit.framework.TestCase.*
import org.junit.Test

class CarFeature {
    private val engine = Engine()
    private val car = Car(6.0, engine)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(5.5, car.fuel)

    }

    @Test
    fun carIsTurningOnItsEngineAndIncreasesTheTemperature() {
        car.turnOn()
        assertTrue( car.engine.isTurnedOn)
        assertEquals(95, car.engine.temperature)
    }
}