fun main() {
    val salario1 = 1000.0
    val salario2 = 2000.0
    val salario3 = 1500.0

//    val maiorSalario = if(salario1 > salario2 && salario1 > salario3) {
//        salario1
//    } else if(salario2 > salario1 && salario2 > salario3) {
//        salario2
//    } else {
//        salario3
//    }

//    val arrayDeSalarios = DoubleArray(3)
//    arrayDeSalarios[0] = 1000.0
//    arrayDeSalarios[1] = 2000.0
//    arrayDeSalarios[2] = 500.0

    val arrayDeSalarios = arrayOf(1000.0, 2000.0, 500.0)

    var maiorSalario = 0.0
    for (indice in arrayDeSalarios.indices) {
        if (arrayDeSalarios[indice] > maiorSalario) {
            maiorSalario = arrayDeSalarios[indice]
        }
        println("Salario: ($indice):${arrayDeSalarios[indice]}")
    }

    println("Maior salario $maiorSalario")

    val somaTodosSalarios = arrayDeSalarios.sum()

    println("Soma todos salarios $somaTodosSalarios")

    val salariosOrdenados = arrayDeSalarios.sorted().reversed()
    println("Salarios ordenados $salariosOrdenados")

}