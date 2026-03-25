package com.example.labo_1

import org.junit.Test

data class Calculadora (
    val marca : String,
    val añosVida : Int,
    var precio : Double
) {
    fun suma(a: Int, b: Int): Int = a + b
    fun resta(a: Int, b: Int): Int = a - b
    fun multiplicacion(a: Int, b: Int): Int = a * b
    fun division(a: Double, b: Double): Double {
        return (if (b != 0.0) a / b else 0.0)
    }
}

class Ejercicio2 {
    @Test
    fun probarCalculadora() {
        val miCalc = Calculadora("Casio", 5, 25.50)

        println("Marca: ")
        println(miCalc.marca)
        println("Suma: ")
        println(miCalc.suma(10, 5))
        println("Resta: ")
        println(miCalc.resta(10, 5))
        println("Multiplicacion: ")
        println(miCalc.multiplicacion(10, 5))
        println("Division: ")
        println(miCalc.division(3.0, 2.0))

    }
}