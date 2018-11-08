import java.io.*;
class Motion_ship
{
    
     public static void main(String args[])throws IOException
     {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int c,i,j,m=0;
        c=(int)Math.random()*10;
        for(i=0;i<=10;i++)
        {
            m++;
            for(i=0;i<=m;i++)
            {
                System.out.println("          ");
                System.out.println("          ");
                System.out.println("          ");
            }
            System.out.print("");
            System.out.print("");
            System.out.print("");
            System.out.println("  ||  ||  ");
            System.out.println("==o==o==o=");
            System.out.println(" ________ ");
            for(j=0;j<=2000000000;j++);
            System.out.println("\f");
        }
    }
}
        