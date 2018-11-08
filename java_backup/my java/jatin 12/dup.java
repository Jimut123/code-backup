import java.util.*;
public class dup
{//declaration of class 
    Scanner sc=new Scanner(System.in);
    int ar[],a,b;//inisialisation of variables
    void input()
    {//function to take input in array
        int m;
        System.out.println("Enter limit");
        a=sc.nextInt();
        ar=new int[a];
        for(m=0;m<a;m++)
        {//loop to take input
            System.out.println("Enter number");
            ar[m]=sc.nextInt();
            if(m==1)
            {
                b=ar[0];
            }
            else if(b<ar[m])
            {
                b=ar[m];
            }
        }//end of loop
        b=b+9;
        el();
    }//endof function
    void el()
    {//funnction to remove duplicate elements
        int m,n;
        for(m=0;m<a;m++)
        {//loop to remove elements
            for(n=1;n<a;n++)
            {
                if(m==n)
                {
                    continue;
                }
                if(ar[m]==ar[n])
                {
                    ar[n]=b;
                }
            }
        }//end of loop
        System.out.println("Required array: ");
        for(m=0;m<a;m++)
        {//loop to print the required array
           if(ar[m]==b)
           {
              continue;
            }
            else
           {
                System.out.println(+ar[m]);
            }
        }//end of loop
    }//end of el
}//end of class