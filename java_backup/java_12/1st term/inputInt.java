import java.util.Scanner;

public class inputInt {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        System.out.println("Enterd number: "+n);
    }
}