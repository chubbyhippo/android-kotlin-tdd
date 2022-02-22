package com.example.outsideintddexample.acceptancetests

import com.example.outsideintddexample.Car
import junit.framework.TestCase
import org.junit.Test

class CarFeature {

    private val car = Car(6.0)

    @Test
    fun carIsLoosingFuelWhenItTurnsOn() {
        car.turnOn()
        TestCase.assertEquals(5.5, car.fuel)

    }
}