
import java.io.*;
class moving_ship_game
{
 public static void main(String args[])throws IOException
 {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        int i,d,max=0,j,n;
        String s;
        System.out.println("How many players would be there ? ");
        n = Integer.parseInt(cd.readLine());
        String names[] = new String[n];
        int a[]=new int[n];
        System.out.println("Enter your names :--->");
        for(i=0;i<n;i++)
        {
           System.out.println("Enter the "+(i+1)+" th name:");
           names[i]=cd.readLine();
        }
        
       for( i=0;i<n;i++)
       {
           d = (int)(Math.random()*100);
           a[i]=d;
           System.out.println(names[i]);
           for( j=1;j<d;j++)
           {
           System.out.print("-");
        }
         System.out.print("\n");
    }
    j=0;
    for(i=0;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
            j=i;
        }
    }
    s=names[j];
    System.out.println("The winner is:"+s);
}
}

