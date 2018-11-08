package Inheritance;
import java.util.*;
class Product
{
    String prodname="";
    int code;
    void readInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product name ");
        prodname=sc.nextLine();
        System.out.print("Enter code of product ");
        code=sc.nextInt();
    }
}
