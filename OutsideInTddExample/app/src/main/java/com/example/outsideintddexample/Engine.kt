package com.example.outsideintddexample

class Engine(
    var isTurnedOn: Boolean = false,
    var temperature: Int = 0
) {
    fun turnOn() {
        isTurnedOn = true
        temperature = 95
    }
}