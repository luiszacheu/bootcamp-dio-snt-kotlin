package oop.conta

class ContaPoupanca(
    override val numero: Int,
    override val agencia: String) : Conta(numero, agencia) {

    override fun taxa(): Double {
        return 0.50
    }

    override fun transferir(contaBancariaDestino: Conta, valor: Double) {
        super.transferir(contaBancariaDestino, valor + taxa())
    }

    override fun toString(): String {
        return "ContaPoupanca(numero=$numero, agencia='$agencia')"
    }


}