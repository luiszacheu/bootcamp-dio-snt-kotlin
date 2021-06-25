package oop

import oop.cliente.ClientePessoaFisica
import oop.cliente.ClientePessoaJuridica
import oop.conta.ContaPoupanca


fun main() {

    val contaPoupancaA = ContaPoupanca(123, "123")
    contaPoupancaA.depositar(10.0)

    val carol = ClientePessoaFisica("Carol", 18, "Bairro Verde", "001", contaPoupancaA)
    carol.imprimirDadosDoCliente()

    val contaPoupancaB = ContaPoupanca(321, "321")
    contaPoupancaB.depositar(5.0)
    val luis = ClientePessoaJuridica("Luis",  "Bairro Verde", "002", contaPoupancaB)
    luis.imprimirDadosDoCliente()

    contaPoupancaA.transferir(contaPoupancaB, 5.0)



}