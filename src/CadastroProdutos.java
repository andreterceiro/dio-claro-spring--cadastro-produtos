import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    /**
     * Products Set
     */
    private Set<Produto> produtoSet;

    /**
     * Constructor
     */
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    /**
     * Adds a product to the set of products
     *
     * @param codigo     Product code
     * @param nome       Product name
     * @param preco      Product price
     * @param quantidade Product quantity
     */
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        Produto produto = new Produto(codigo, nome, preco, quantidade);
        this.produtoSet.add(produto);
    }

    /**
     * Method that exibits the produtcs ordering by the name of the product
     * 
     * @return The products ordered by name
     */
    public Set<Produto> exibirProdutosPorNome() {
        // We are using a treeset because we need to mantain organized and ordered the data 
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtoSet);
        return produtosPorNome;
    }

    /**
     * Method that exibits the produtcs ordering by the price of the product
     *
     * @return The products ordered by price
     */
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtoSet);
        return produtosPorPreco;
    }
}
