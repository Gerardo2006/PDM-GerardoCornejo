package com.example.labo_1

import org.junit.Test

data class Computadora (
    var sistemaOperativo : String,
    var RAM : Int,
    var almacenamiento : Int,
    var resolucion : String,
    var Estado : Boolean = true,
    val programasInstalados : List<String>
)

class Ejercicio1 {

    @Test
    fun ejecutarEjercicio() {

        val miCompu = Computadora(
            "Windows 11",
            16,
            256,
            "1920 x 1200",
            true,
            listOf(
            "Instagram 2020", "VS Code 2026",
            "Spotify 2023", "Notion 2026",
            "Facebook 2024", "Photoshop 2025",
            "Slack 2026", "Excel 2021",
            "Zoom 2026")
        )

        val programas2026 = miCompu.programasInstalados.filter { it.contains("2026") }
        val textoEstado = if (miCompu.Estado) "encendido" else "apagado"

        println("--- Detalles de la Computadora ---")
        println("Sistema: ")
        println(miCompu.sistemaOperativo)
        println("RAM: ")
        println("${miCompu.RAM} GB")
        println("Almacenamiento: ")
        println("${miCompu.almacenamiento} GB")
        println("Resolución: ")
        println(miCompu.resolucion)
        println("Estado actual: ")
        println(textoEstado)
        
        println("\nProgramas instalados en 2026:")
        programas2026.forEach { println(it) }
    }
}
