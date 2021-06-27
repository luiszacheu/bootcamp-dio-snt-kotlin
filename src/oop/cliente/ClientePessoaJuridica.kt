package oop.cliente

import oop.conta.Conta

class ClientePessoaJuridica(
    val razaoSocial: String,
    pEndereco: Endereco,
    pCnpj: String,
    pConta: Conta
) : Cliente(pEndereco, pConta) {

    var cnpj: String = pCnpj
        private set(value) {
            value.toUpperCase()
            field = value
        }

    override fun imprimirDadosDoCliente() {
        println("Cliente PJ: {${this.razaoSocial}, ${this.cnpj}} / Conta: ${this.conta}}")
    }

}