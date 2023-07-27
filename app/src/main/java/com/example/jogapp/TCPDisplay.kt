package com.example.jogapp

open class TCP {
    var x: Float = 0.0f
    var y: Float = 0.0f
    var z: Float = 0.0f
    var rx: Float = 0.0f
    var ry: Float = 0.0f
    var rz: Float = 0.0f

    fun move(dx: Float, dy: Float, dz: Float) {
        x += dx
        y += dy
        z += dz
    }

    fun rotate(rx: Float, ry: Float, rz: Float) {
        this.rx += rx
        this.ry += ry
        this.rz += rz
    }
}

class TCPTCP : TCP() {

}

// TCP 클래스를 상속하는 BaseTCP 클래스
class BaseTCP : TCP() {

}