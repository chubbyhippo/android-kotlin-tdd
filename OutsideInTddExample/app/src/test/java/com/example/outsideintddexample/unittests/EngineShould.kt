package com.example.outsideintddexample.unittests

import com.example.outsideintddexample.Engine
import junit.framework.TestCase.assertTrue
import org.junit.Test

class EngineShould {

    private val engine = Engine()

    @Test
    fun turnOn() {
        engine.turnOn()
        assertTrue(engine.isTurnedOn)
    }
}