package oop.cliente

data class Endereco(
    val descricao: String,
    val rua: String,
    val numero: Int,
    val cep: String,
    val cidade: String,
    val estado: String
) {
    init {
        require(descricao.trim().isBlank()) {"Campo descricao não pode ser vazio"}
    }
}
