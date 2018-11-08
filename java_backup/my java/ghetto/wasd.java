import java.util.*;
public class wasd{
public static void main(int n){
Scanner sc=new Scanner(System.in);
int a=0;int b=0;int s=0;int d=0;int e=0;int f=0;int d1=0;int d2=0;
a=n;
while(a>0)
      {
          b=a%10;
          s=s*10+b;
          a=a/10;
        
        }
    while(s>0)
    {
        d=s%10;
        if(d==0)
        {
            d1=s%100;
            if(d1==1)
            {
                d2=s%1000;
                if(d2==11)
                System.out.print("eleven");
                if(d2==12)
                System.out.print("twelve");
                if(d2==13)
                System.out.print("thirteen");
                if(d2==14)
                System.out.print("fourteen");
                if(d2==15)
                System.out.print("fifteen");
                if(d2==16)
                System.out.print("sixteen");
                if(d2==17)
                System.out.print("seventeen");
                if(d2==18)
                System.out.print("eighteen");
                if(d2==19)
                System.out.print("nineteen");
                
    }
}
        if(d1==2)
         System.out.print("twenty");
         if(d1==3)
         System.out.print("thirty");
         if(d1==4)
         System.out.print("fourty");
         if(d1==5)
         System.out.print("fifty");
         if(d1==6)
         System.out.print("sixty");
         if(d1==7)
         System.out.print("seventy");
         if(d1==8)
         System.out.print("eighty");
         if(d1==9)
         System.out.print("ninety");
        if(d==1)
        System.out.print("one hundred");
         if(d==2)
        System.out.print("two hundred");
         if(d==3)
        System.out.print("three hundred");
         if(d==4)
        System.out.print("four hundred");
         if(d==5)
        System.out.print("five hundred");
         if(d==6)
        System.out.print("six hundred");
         if(d==7)
        System.out.print("seven hundred");
         if(d==8)
        System.out.print("eight hundred"); 
        if(d==9)
        System.out.print("nine hundred");
        s=s/10;
        e=s%10;
         if(e==1)
            {
                e=s%100;
                if(e==11)
                System.out.print("eleven");
                if(e==12)
                System.out.print("twelve");
                if(e==13)
                System.out.print("thirteen");
                if(e==14)
                System.out.print("fourteen");
                if(e==15)
                System.out.print("fifteen");
                if(e==16)
                System.out.print("sixteen");
                if(e==17)
                System.out.print("seventeen");
                if(e==18)
                System.out.print("eighteen");
                if(e==19)
                System.out.print("nineteen");
                
    }
              if(e==2)
              System.out.print("twenty");
               if(e==3)
              System.out.print("thirty");
               if(e==4)
              System.out.print("fourty");
               if(e==5)
              System.out.print("fifty");
               if(e==6)
              System.out.print("sixty");
               if(e==7)
              System.out.print("seventy");
               if(e==8)
              System.out.print("eighty");
               if(e==9)
              System.out.print("ninety");
               if(e==0)
              System.out.print("and");
              s=s/10;
              f=s%10;
         if(f==1)
         System.out.print("one");
         if(f==2)
         System.out.print("two");
         if(f==3)
         System.out.print("three");
         if(f==4)
         System.out.print("four");
         if(f==5)
         System.out.print("five");
         if(f==6)
         System.out.print("six");
         if(f==7)
         System.out.print("seven");
         if(f==8)
         System.out.print("eight");
         if(f==9)
         System.out.print("nine");
         s=s/10;
         
        }
    }
}

        