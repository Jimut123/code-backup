import java.util.*;
public class kaprekar
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter lower limit : ");
    int ll=sc.nextInt();
    System.out.print("enter upper limit : ");
    int ul=sc.nextInt();
    int nd=0;
    int sqr=0;
    int fp=0,lp=0;
    int count=0;
    int total=0;
    int temp;
    for(int i=ll;i<=ul;i++)
    {
        nd=0;
        int k=i;
        while(k>0)
        {
            k=k/10;
            nd=nd+1;
        }
       
        
        fp=i*i;
        lp=0;
        temp=0;
        for(int j=1;j<=nd;j++)
        {
            temp=temp*10;
            temp=temp+fp%10;
            fp=fp/10;
            
        }
        
        
    
        while(temp>0)
        {
            lp=lp*10+temp%10;
            
            temp=temp/10;
        }

        total=fp+lp;
        if(total==i)
        {
            System.out.println("Kaprekar number : "+i);
            count=count+1;
        }
    }
    System.out.println("Total number of kaprekar numbers in range : "+ll+" to "+ul+"is :");
    System.out.println(count);
}
}
        
