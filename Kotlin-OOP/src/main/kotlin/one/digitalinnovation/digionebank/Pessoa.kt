package one.digitalinnovation.digionebank

class Pessoa {
    val nome: String = "Fernando"
    val cpf: String = "111.222.333-45"
}

fun main() {
    val fernando = Pessoa()

    println(fernando.nome)
    println(fernando.cpf)
}