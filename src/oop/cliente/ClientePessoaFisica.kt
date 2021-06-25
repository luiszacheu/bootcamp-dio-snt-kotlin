package oop.cliente

import oop.conta.Conta

class ClientePessoaFisica(
    val nome: String,
    val idade: Int,
    var endereco: String,
    pCpf: String,
    pConta: Conta
) : Cliente(pConta) {

    private val cpf = pCpf

    override fun imprimirDadosDoCliente() {
        println("Cliente PF: {${this.nome}, ${this.cpf}} / Conta: ${this.conta}}")
    }


}