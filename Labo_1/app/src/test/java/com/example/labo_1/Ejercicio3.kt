package com.example.labo_1

import org.junit.Test

data class Estudiante (
    val nombre : String,
    val carnet : String,
    var asignatura : String,
)

class Ejercicio3 {
@Test
    fun ejecutarEjercicio() {

    //Moviles
    val estudiante1 = Estudiante("Gerardo", "00043524", "Programacion de dispositivos Moviles")
    val estudiante2 = Estudiante("Luis", "05634824", "Programacion de dispositivos Moviles")
    val estudiante3 = Estudiante("Diego", "00556324", "Programacion de dispositivos Moviles")

    //Analisis
    val estudiante4 = Estudiante("Gerardo", "00043524", "Analisis de Sistemas")
    val estudiante5 = Estudiante("Frank", "05348524", "Analisis de Sistemas")
    val estudiante6 = Estudiante("Iguana", "00664724", "Analisis de Sistemas")
    val estudiante7 = Estudiante("Luis", "05634824", "Analisis de Sistemas")


    val Ciclo01 = listOf(
        estudiante1,
        estudiante2,
        estudiante3,
        estudiante4,
        estudiante5,
        estudiante6,
        estudiante7
    )

    val Moviles = Ciclo01.filter { it.asignatura == "Programacion de dispositivos Moviles" }
    println("\nEstudiantes de Moviles:")
    Moviles.forEach { println(it.nombre) }

}
}