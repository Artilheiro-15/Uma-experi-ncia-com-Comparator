import entities.MyComparator;
import entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("=====================================");

    List<Product> list = new ArrayList<>();

    list.add(new Product("Tv", 900.0));
    list.add(new Product("Notebook", 1200.0));
    list.add(new Product("Tablet", 400.0));

    //aki eu fiz uma vareavel comp que vai ser um objeto do tipo Comparator<Product>
    Comparator<Product> comp = new Comparator<Product>() {
      // e para definir esse objeto eu criei uma claas anonima aki mesmo dentro do programa principal
      //eu nao vou mais presisar ter uma class separada
      @Override
      public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
      }
    };

    list.sort(comp);

    for (Product p : list) {
      System.out.println(p);
    }

    System.out.println("=====================================");
  }
}
