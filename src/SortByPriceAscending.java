import java.util.Comparator;

public class SortByPriceAscending implements Comparator<Product> {
    public int compare(Product p1,Product p2){
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
