package oop.conta

class ContaCorrente(
    override val numero: Int,
    override val agencia: String) : Conta(numero, agencia){

    override fun taxa(): Double {
       return 0.0
    }
}