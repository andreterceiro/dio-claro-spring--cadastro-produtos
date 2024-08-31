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

    /**
     * Main method that helps us in manual tests
     *
     * @param args Arguments passed through CLI (ignored)
     */
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        // See that will be not allowed 2 products with the same code (different in other properties)
        cadastroProdutos.adicionarProduto(1L, "Lápis", 1.5D, 3);
        cadastroProdutos.adicionarProduto(1L, "Lápis", 2.5D, 2);
        cadastroProdutos.adicionarProduto(3L, "Borracha", 2D, 5);
        cadastroProdutos.adicionarProduto(4L, "Apontador", 3.2D, 1);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
