
public class print
{
    public static void main(String args[])
    {
        print abc = new print();
        abc.delay();
        abc.disp();
        for(int i = 1;i<=10;i++)
        {
            abc.delay();//delay loop.
        }
        System.out.println("\f");
    }
    public void disp()
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                                                      ***    *****            ********               *******     ");
        System.out.println("                                                                                      ***   ***               ***   ****          ***            ");
        System.out.println("                                                                                      ***  **                 ***   ****          ***            ");
        System.out.println("                                                                                      ******                  *******             ***            ");
        System.out.println("                                                                                      ***  **                 ***   ****          ***            ");
        System.out.println("                                                                                      ***   ***        ***    ***   ****    ***    ***           ");
        System.out.println("                                                                                      ***    *****     ***    ********      ***      *******     ");
    }
    public void delay()
    {
        for(long i = 1;i<=2000000000;i++){}        
    }
}
