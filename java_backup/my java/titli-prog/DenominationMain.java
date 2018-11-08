//
import java.util.*;
class DenominationMain
{
   public static void main(String args[])
   {
       Denomination obj=new Denomination();
       obj.get();
    }
}
class Denomination
{
   private int notes[]={1000,500,100,50,20,10,5,2,1};
   public void get()
   {
       Scanner sc=new Scanner(System.in);
       System.out.print("Input : ");
       int n=sc.nextInt();
       System.out.println("Output : ");
       calc(n,0);
    }
    public void calc(int k,int i)
    {
        if (i>8||k==0)
         System.exit(0);
        if (k/notes[i]>0)
        {
            System.out.println((k/notes[i])+"x"+notes[i]);
            k=k-(k/notes[i])*notes[i];
        }
        calc(k,i+1);
    }
}
