package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar() = "${ dia }/${ mes }/${ ano }"
}

fun main() {
    var nascimento = Data(dia = 11, mes = 10, ano = 2003)
    println("${ nascimento.dia }/${ nascimento.mes }/${ nascimento.ano }")

    with(nascimento) { println("${ dia }/${ mes }/${ ano }") }

    nascimento.mes = 11
    println(nascimento.formatar())
}