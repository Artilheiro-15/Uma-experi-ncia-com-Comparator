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

    //Agora e o seguinte essa declaraçao de class aki ela e muito gramde para deixar isso aki muito mais enchuto
    //eu vou começar agora a usar as expreçao lambida

    list.sort((p1, p2) ->
      p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())
    );
    //entao agora ta so desse geito eu chamo list.sort e como argumento do meu sort eu coloquei uma expreçao lambida
    //que e uma funçao anonima que eu posso definir de uma forma bem consisa bem resulmida

    for (Product p : list) {
      System.out.println(p);
    }

    System.out.println("=====================================");
  }
}
