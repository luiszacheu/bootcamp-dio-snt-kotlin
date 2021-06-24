package oop.conta

abstract class Conta(
    open val numero: Int,
    open val agencia: String,
    private var saldo: Double = 0.0) : MovimentacaoBancaria {

    abstract fun taxa() : Double

    open fun temSaldo(valor: Double) : Boolean {
        return (saldo >= valor)
    }

    open fun getSaldo() : Double {
        return saldo
    }

    override fun sacar(valor: Double) {
        if (temSaldo(valor)) {
            saldo -= valor
            println("Saque -> Valor: $valor")
        } else {
            println("Saque -> Não há saldo suficiente!")
        }
    }

    override fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Deposito -> Valor: $valor")
        } else {
            println("Deposito -> Informe um valor válido para depósito")
        }
    }

    override fun transferir(contaBancariaDestino: Conta, valor: Double) {
        if (temSaldo(valor)) {
            this.sacar(valor)
            contaBancariaDestino.depositar(valor)
            println("""
                Transferencia -> Valor: $valor
                Conta origem: ${this.numero} Saldo atual: ${this.getSaldo()} 
                Conta destino ${contaBancariaDestino.numero} Saldo atual: ${contaBancariaDestino.getSaldo()}
            """.trimIndent())
        } else {
            print("Transfenrecia -> Não foi possivel realizar a transferencia!")
        }
    }
}