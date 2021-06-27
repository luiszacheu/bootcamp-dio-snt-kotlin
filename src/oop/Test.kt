package oop

import oop.cliente.ClientePessoaFisica
import oop.cliente.ClientePessoaJuridica
import oop.cliente.Endereco
import oop.conta.ContaPoupanca


fun main() {

    val contaPoupancaA = ContaPoupanca(123, "123")
    contaPoupancaA.depositar(10.0)

    val enderecoCarolCasa = Endereco(
        "",
        "Rua Abc",
        1,
        "12345-678",
        "São Paulo",
        "São Paulo")

    val carol = ClientePessoaFisica("Carol", 18, enderecoCarolCasa, "001", contaPoupancaA)
    carol.imprimirDadosDoCliente()

    val contaPoupancaB = ContaPoupanca(321, "321")
    contaPoupancaB.depositar(5.0)


    val enderecoLuisCasa = Endereco(
        descricao = "",
        rua = "Rua Abc",
        numero = 1,
        cep = "12345-678",
        cidade = "São Paulo",
        estado = "São Paulo")
    val luis = ClientePessoaJuridica("Luis", enderecoLuisCasa , "002", contaPoupancaB)
    luis.imprimirDadosDoCliente()

//    contaPoupancaA.transferir(contaPoupancaB, 5.0)


    println(luis.segmento)
    luis.conta.depositar(20.0)
    println(luis.segmento)

}