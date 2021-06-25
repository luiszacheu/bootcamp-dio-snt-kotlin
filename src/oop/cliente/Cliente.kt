package oop.cliente

import oop.conta.Conta

abstract class Cliente(pConta: Conta) {

    protected val conta: Conta = pConta

    abstract fun imprimirDadosDoCliente()

}
