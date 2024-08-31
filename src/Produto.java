import java.util.Objects;

public class Produto {
    /**
     * Código do produto
     */
    private long codigo;

    /**
     * Nome do produto
     */
    private String nome;

    /**
     * Preço do produto
     */
    private double preco;

    /**
     * Quantidade do produto
     */
    private int quantidade;

    /**
     * Constructor, who sets the passed values in the properties
     * 
     * @param codigo     Código do produto
     * @param nome       Nome do produto
     * @param preco      Preço do produto
     * @param quantidade Quantidade do produto
     */
    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    /**
     * Getter de this.codigo
     * 
     * @return this.codigo
     */
    public long getCodigo() {
        return this.codigo;
    }

    /**
     * Getter de this.nome
     * 
     * @return this.nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter de this.preco
     * 
     * @return this.preco
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * Getter de this.quantidade
     * 
     * @return this.quantidade
     */
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * Method that provides a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        return "{Produto: código='" + this.getCodigo() + "', nome='" + this.getNome() + "', preço='" + this.getPreco() + "', quantidade='" + this.getQuantidade() + "'}";
    }

    /**
     * Método para comparação de dois objetos desta classe
     *
     * @param object Object to be compared to this object
     * @return boolean true if this instance equals to the passed object, otherwise false
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Produto other = (Produto) object;
        return other.getCodigo() == this.getCodigo();
    }

    /**
     * The hashCode method helps the comparison of two objects of this class
     *
     * @return Return the hash code related to this object
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getCodigo());
    }}
