import java.util.*;
public class game1 {

public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int pos,n=0;
pos =85;
for(int i=pos;i<90;i++)
{
n=i;
break;
}
String z;
int n1=0,b=0,c=0,a=0;
 
 
 for(c=0;c<=5;c++)
 {
     System.out.println("enter number ");
     n1=sc.nextInt();
 if(n1>n)
 {
     a=n1-n;
     if(a>=100)
     System.out.println("very far bud.. greater than the digit");
     
     
     if(a<100&&a>=50)
     System.out.println("close within 50 and above range");
     
      
     if(a<50&&a>=10)
     System.out.println("closer within 10 range greater than the number");
     
      
     if(a<10&&a>=5)
     System.out.println("very close greater than the number");
     
      
     if(a<5);
     System.out.println("closest within 5 greater than the number");
     ;
      
     if (a==0)
     System.out.println("BINGO!!!!!");
     b=b+1;
    }
    if(n1<n)
 {
     a=n-n1;
     if(a>=100)
     System.out.println("very far bud.. less than the digit");
     
      
     if(a<100&&a>=50)
     System.out.println("close wiothin 50 and lower range");
     
      
     if(a<50&&a>=10)
     System.out.println("closer within 10 range lower than the number");
     
      
     if(a<10&&a>=5)
     System.out.println("very close lower than the number");
     
      
     if(a<5);
     System.out.println("closest within 5 lower than the number");
     
      
     
    }
    if(b==1)
    System.out.println("thank you u did it in "+c+"chances");
    
    
        
        }
         System.out.println("sorry ur turns r over");
         System.out.println("the real number is"+n);
         
         System.out.println("plz enter a key to cimtinue");
         z=sc.nextLine();
         System.exit(0);
    
}
  }       
