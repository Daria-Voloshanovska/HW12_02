import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
private List<Product> products;

public OnlineStore(){
    products = new ArrayList<>();
}
public void addProduct(Product product){
    products.add(product);
}
public void sortByPriceAscending(){
    products.sort(new SortByPriceAscending());
}
public void sortByPriceDescending(){
    products.sort(new SortByPriceDescending());
}
public void sortByRating(){
    products.sort(new SortByRating());
}
public void sortByStock(){
    products.sort(new SortByStock());
}
public void printProducts(){
    for(Product product : products){
        System.out.println(product);
    }
}


}
