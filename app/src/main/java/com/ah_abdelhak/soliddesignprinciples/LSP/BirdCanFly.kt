package com.ah_abdelhak.soliddesignprinciples.LSP

class BirdCanFly : Bird() {
    override fun eat() {}
    override fun sleep() {}

    fun fly(): String {
        return "Bird Fly"
    }
}