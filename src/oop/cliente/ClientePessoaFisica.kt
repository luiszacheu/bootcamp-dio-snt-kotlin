package oop.cliente

import oop.conta.Conta

class ClientePessoaFisica(
    pNome: String,
    pConta: Conta,
    pCpf: String
) : Cliente(pNome, pConta) {

    private val cpf = pCpf

}