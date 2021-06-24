package oop.conta

interface MovimentacaoBancaria {

    fun sacar(valor: Double)

    fun depositar(valor: Double)

    fun transferir(contaBancariaDestino: Conta, valor: Double)

}