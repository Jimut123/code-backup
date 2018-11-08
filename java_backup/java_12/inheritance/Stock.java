import java.io.*;
class Stock
{
    String item;
    int qty,rate,amt;
    Stock(String ite,int qt,int r)
    {
        item=ite;
        qty=qt;
        rate=r;
        amt=qty*rate;
    }
    void display()
    {
        System.out.println("The Stock details are : ");
        System.out.println("Item name : "+item);
        System.out.println("Quantity of item : "+qty);
        System.out.println("Unit price of the item : "+rate);
        System.out.println("Net value of");
    }
}