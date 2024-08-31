import java.util.Comparator;

public class ComparatorPorPreco implements Comparator<Produto> {
    /**
     * Method that helps the task of compare two products by price
     */
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
