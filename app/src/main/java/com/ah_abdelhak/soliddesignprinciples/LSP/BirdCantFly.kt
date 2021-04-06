package com.ah_abdelhak.soliddesignprinciples.LSP

class BirdCantFly: Bird() {
    override fun eat() {}
    override fun sleep() {}
    fun walk(): String {
        return "Bird Walk"
    }
}