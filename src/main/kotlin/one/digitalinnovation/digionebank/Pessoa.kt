package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Leandro"
    var cpf: String = "034.246.599-67"
    private  set
}

fun main() {
    val leandro = Pessoa()
    println(leandro)
    println(leandro.name)
    println(leandro.cpf)
}