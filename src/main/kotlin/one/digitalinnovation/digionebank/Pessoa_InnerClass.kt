package one.digitalinnovation.digionebank

class Pessoa1 {
    var name: String = "Leandro"
    var cpf: String = "034.246.599-67"

    inner class Endereco1 {
        var rua: String = "Piscis Austrinos"
    }
}

fun main() {
    val leandro = Pessoa1()

    println(leandro.name)
    println(leandro.cpf)
    println(leandro.Endereco1().rua)
}