import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

OnlineStore store = new OnlineStore();
store.addProduct(new Product("Laptop",1320.0,4.6,19));
store.addProduct(new Product("Smartphone",950,4.8,23));
store.addProduct(new Product("Headphones", 99.50,3.7,36));
store.addProduct(new Product("TV set",2500,4.5,12));
store.addProduct(new Product("Fridge", 745.60,4.9,28));

Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите способ сортировки:");
        System.out.println("1 - По цене (по возрастанию)");
        System.out.println("2 - По цене (по убыванию)");
        System.out.println("3 - По рейтингу");
        System.out.println("4 - По количеству на складе");

        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                store.sortByPriceAscending();
                break;
            case 2:
                store.sortByPriceDescending();
                break;
            case 3:
                store.sortByRating();
                break;
            case 4:
                store.sortByStock();
                break;
            default:
                System.out.println("Неверный выбор. Сортировка не выполнена.");
                return;

        }
        System.out.println("Отсортированый список товаров:");
        store.printProducts();

    }
}