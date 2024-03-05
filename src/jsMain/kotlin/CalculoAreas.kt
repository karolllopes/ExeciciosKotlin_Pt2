package kotlin

import kotlin.math.sqrt


class Area {
    fun retangulo(b: Double, h: Double): Double {
        return b * h
    }

    fun trianguloEsc(a: Double, b: Double, c: Double): Double {
        val s = (a + b + c) / 2
        return sqrt(s * (s - a) * (s - b) * (s - c))
    }

    fun trianguloIso(b: Double, h: Double): Double {
        return (b * h) / 2
    }
    fun trianguloEqu(lad: Double): Double {
        return  lad * lad * sqrt(3.0) / 4
    }

    fun Circu(r: Double): Double {
        return  Math.PI * r * r
    }

    fun Losa(d1: Double, d2: Double): Double {
        return  (d1 * d2) / 2
    }

    fun Trap(B: Double, b: Double, h: Double): Double {
        return  ((B + b) * h) /2
    }

}

fun main() {
    var opcao: String? = null

    println("Selecione a função da area:")
    println("1 - Retângulo")
    println("2 - Triângulo (Escaleno, Isósceles, Equilátero)")
    println("3 - Circuferência")
    println("4 - Losango")
    println("5 - Trapézio")

    val Area_Feita = Area()

    opcao = readLine()

    when (opcao) {
        "1" -> {
            println("Entre com a base e altura do retângulo:")
            val base = readLine()?.toDoubleOrNull() ?: 0.0
            val altura = readLine()?.toDoubleOrNull() ?: 0.0
            println("A área do retângulo é: ${Area_Feita.retangulo(base, altura)}")
        }
        "2" -> {
            println("1 - Triângulo Escaleno")
            println("2 - Triângulo Isósceles")
            println("3 - Triângulo Equilátero")
            val opcao2 = readLine()
            when (opcao2) {
                "1" -> {
                    println("Entre com os comprimentos dos lados do Triângulo Escaleno:")
                    val a = readLine()?.toDoubleOrNull() ?: 0.0
                    val b = readLine()?.toDoubleOrNull() ?: 0.0
                    val c = readLine()?.toDoubleOrNull() ?: 0.0
                    if (a != null && b != null && c != null && a + b > c && a + c > b && b + c > a) {
                        println("A área do triângulo Escaleno é: ${Area_Feita.trianguloEsc(a, b, c)}")
                    } else {
                        println("Valores inválido.")
                    }
                }
                "2" -> {
                    println("Entre com a base e altura do Triângulo Isósceles:")
                    val base = readLine()?.toDoubleOrNull() ?: 0.0
                    val alt = readLine()?.toDoubleOrNull() ?: 0.0
                    println("A área do triângulo Isósceles é: ${Area_Feita.trianguloIso(base, alt)}")
                }
                "3" -> {
                    println("Entre com o lado do Triângulo Equilátero:")
                    val lado = readLine()?.toDoubleOrNull() ?: 0.0
                    println("A área do triângulo equilátero é: ${Area_Feita.trianguloEqu(lado)}")
                }
                else -> println("Opção inválida")
            }
        }
        "3" -> {
            println("Entre com a raio do Circuferência:")
            val r = readLine()?.toDoubleOrNull() ?: 0.0
            println("A área da circuferência é: ${Area_Feita.Circu(r)}")
        }
        "4" -> {
            println("Entre com a  D (maior) e d (menor) do Losango:")
            val d1 = readLine()?.toDoubleOrNull() ?: 0.0
            val d2 = readLine()?.toDoubleOrNull() ?: 0.0
            println("A área do losango é: ${Area_Feita.Losa(d1, d2)}")
        }
        "5" -> {
            println("Entre com a B (base maior) b (base menor) h(altura do trapézio) do Trapézio:")
            val D = readLine()?.toDoubleOrNull() ?: 0.0
            val d  = readLine()?.toDoubleOrNull() ?: 0.0
            val h = readLine()?.toDoubleOrNull() ?: 0.0
            println("A área do trapézio é: ${Area_Feita.Trap(D, d, h)}")
        }
        else -> println("Opção inválida")
    }
}
