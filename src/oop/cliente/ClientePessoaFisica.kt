package oop.cliente

import oop.conta.Conta

class ClientePessoaFisica(
    val nome: String,
    val idade: Int,
    pEndereco: Endereco,
    pCpf: String,
    pConta: Conta
) : Cliente(pEndereco, pConta) {

    private val cpf = pCpf

    override fun imprimirDadosDoCliente() {
        println("Cliente PF: {${this.nome}, ${this.cpf}} / Conta: ${this.conta}}")
    }


}