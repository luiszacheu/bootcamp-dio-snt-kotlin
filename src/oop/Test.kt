package oop

import oop.conta.ContaPoupanca


fun main() {
    val contaPoupancaA = ContaPoupanca(123, "123")
    contaPoupancaA.depositar(10.0)
    val contaPoupancaB = ContaPoupanca(321, "321")
    contaPoupancaB.depositar(5.0)



    contaPoupancaA.transferir(contaPoupancaB, 5.0)



}