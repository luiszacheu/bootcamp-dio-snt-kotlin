package oop.cliente

import oop.conta.Conta

open class Cliente(pNome: String, pConta: Conta) {
    private val nome = pNome
    private val conta = pConta
}
