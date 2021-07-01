package estruturaDados

class Produto(val name: String, val valor: Double)

class CarrinhoDeCompras() {

    private val _listaDeProdutos: MutableList<Produto> = mutableListOf()

    fun quantidadeDeProdutos(): Int {
        return _listaDeProdutos.size
    }

    fun listaProdutos() {
        println("Quant. ${quantidadeDeProdutos()} - Lista de produtos: $_listaDeProdutos")
    }

    fun listarProdutosPorOrdem() {
        println("Itens Ordenados ${_listaDeProdutos.sortBy { it.name }}")
    }

    fun adicionarProduto(produto: Produto) {
        _listaDeProdutos.add(produto)
    }

    fun removerProduto(posicao: Int) {
        _listaDeProdutos.removeAt(posicao)
    }

    fun removerProduto(produto: Produto) {
        _listaDeProdutos.remove(produto)
    }

    fun buscarProdutoPorNome(nome: String) {
        val produtos = _listaDeProdutos.filter { produto ->
            (produto.name.contains(nome))
        }
        println("produtos encontrados: $produtos")
    }

    fun produtoMaisCaro(): Produto? {
        return _listaDeProdutos.maxByOrNull { produto ->
            produto.valor
        }
    }

    fun produtoMaisBarato(): Produto? {
        return _listaDeProdutos.minByOrNull {
            it.valor
        }
    }

    fun somaDosProdutos(): Double {
        return _listaDeProdutos.sumByDouble { it.valor }
    }

    fun esvaziar() {
        _listaDeProdutos.removeAll(_listaDeProdutos)
    }
}


fun main() {
    val carrinhoDeCompras = CarrinhoDeCompras()
    carrinhoDeCompras.listaProdutos()
    val produto1 = Produto("Mouse", 35.0)
    val produto = Produto("Mouse", 35.0)
    val produto2 = Produto("Teclado", 50.0)
    carrinhoDeCompras.adicionarProduto(produto1)
    carrinhoDeCompras.adicionarProduto(produto2)
    carrinhoDeCompras.listaProdutos()
//    carrinhoDeCompras.removerProduto(produto1)
    carrinhoDeCompras.listaProdutos()

    carrinhoDeCompras.buscarProdutoPorNome("Mou")
//
    println("Produto mais caro: ${carrinhoDeCompras.produtoMaisCaro()}")
    println("Produto mais barato: ${carrinhoDeCompras.produtoMaisBarato()}")
//
    println("Total do carrinho: ${carrinhoDeCompras.somaDosProdutos()}")

    carrinhoDeCompras.esvaziar()
    carrinhoDeCompras.listaProdutos()


    val listaMutavel = mutableListOf("luis", "gustavo")
    val listaImutavel = listOf("luis", "gustavo")

    println("Item da lista ${listaImutavel.get(1)}")

    listaMutavel.removeAt(1)
    println("Lista $listaMutavel")


    val sets = setOf<Produto>(produto, produto1)
    println(sets)
}

