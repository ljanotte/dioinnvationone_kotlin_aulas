package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    var pf = ClienteTipo.PF
    println(">> ${pf.name} - ${pf.descricao}")

    var pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}