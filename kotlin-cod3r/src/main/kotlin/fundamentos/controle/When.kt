package fundamentos.controle

fun main() {
    val nota = 8.3

    when(nota) {
        in 9.0..10.0 -> println("Fantástico")
        in 7.0..8.9 ->  println("Parabéns")
        in 4.0..6.9 -> println("Tem como recuperar")
        in 0.0..3.9 -> println("Te vejo no próximo semestre")
        else -> println("Nota inválida")
    }
}