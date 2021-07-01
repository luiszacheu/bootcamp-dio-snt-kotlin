import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {
    val salario1 = 10.0
    val salario2 = 120.0
    val salario3 = 100.0

    val maxSalario = if (salario1 > salario2 && salario1 > salario3) {
        salario1
    } else if(salario2 > salario1 && salario2 > salario3) {
        salario2
    } else {
        salario3
    }

    println("maior salario -> $maxSalario")

    IntArray(3)
    StringArray()

//    val arrayDeSalarios = DoubleArray(5)
//    arrayDeSalarios[0] = 100.0
//    arrayDeSalarios[1] = 200.0
//    arrayDeSalarios[2] = 2500.0
//    arrayDeSalarios[3] = 4300.0
//    arrayDeSalarios[4] = 330.0

    val arrayDeSalarios = doubleArrayOf(100.0, 200.0, 2500.0, 4300.0, 330.0)

    val idadeInicial = arrayDeSalarios[0]
    var maiorIdade = idadeInicial
//    for (indice in arrayDeSalarios.indices) {
//        println(arrayDeSalarios[indice])
//        if (arrayDeSalarios[indice] < maiorIdade) {
//            maiorIdade = arrayDeSalarios[indice]
//        }
//    }

    for ((indice, idade) in arrayDeSalarios.withIndex()) {
        println("[$indice]=$idade")
        if (idade < maiorIdade) {
            maiorIdade = idade
        }
    }

    println("Idade: $maiorIdade ")

    println("Salario min: ${arrayDeSalarios.minOrNull()}")

    println("Salario max: ${arrayDeSalarios.maxOrNull()}")

    arrayDeSalarios.singleOrNull() { salario ->
        (salario == 5.0)
    }.also {
        println("Buscar valor -> $it")
    }

    arrayDeSalarios.sortedArrayDescending().onEach {
        println(it)
    }

    println("===========\n")

    arrayDeSalarios.sorted().onEach {
        println(it)
    }
}