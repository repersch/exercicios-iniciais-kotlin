package br.edu.ifsp.scl.ads.pdm.exerciciosiniciaiskotlin

fun main() {

    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")

    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    var contador: Int = 0

    listaCursos.forEach {
        curso -> if ( curso.contains("Sistemas") ) {
            println("${contador} - ${curso}")
            contador++
        }
    }

}