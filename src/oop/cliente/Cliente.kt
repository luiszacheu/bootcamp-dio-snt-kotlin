package oop.cliente

import oop.conta.Conta

abstract class Cliente(var conta: Conta) {

    val segmento: Segmento
        get() = if (conta.getSaldo() < 10.0) {
            Segmento.CLASSIC
        } else {
            Segmento.VAN_GOGH
        }

    abstract fun imprimirDadosDoCliente()

}
