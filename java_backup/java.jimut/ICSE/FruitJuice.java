
import java.util.Scanner;
 
public class FruitJuice {
 
    int product_code;
   String flavour;
    String pack_type;
    int pack_size;
    int product_price;
	 
    public FruitJuice()
    {
        product_code = 0;     
	    flavour = "";
	    pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
 
    public void input() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product code: ");
        product_code = scanner.nextInt();
        System.out.print("Enter flavour: ");
        flavour = scanner.next();
        System.out.print("Enter pack type: ");
        pack_type = scanner.next();
        System.out.print("Enter pack size: ");
        pack_size = scanner.nextInt();
        System.out.print("Enter product price: ");
        product_price = scanner.nextInt();
    }
 
    public void discount()
    {
        product_price = (int) (0.9 * product_price);
    }
 
    public void display() 
    {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
}
