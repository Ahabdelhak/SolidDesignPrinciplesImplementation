package com.ah_abdelhak.soliddesignprinciples.OpenClosed

/*
*This Class referring to open/Closed Interface that show OpenClosed Principle
* open/Closed >> Software entities such as classes, functions, modules should be open for extension but not modification
* */
class Mercedes: Car {
    override fun getBrand(): String {
        return "Mercedes-Benz"
    }
}