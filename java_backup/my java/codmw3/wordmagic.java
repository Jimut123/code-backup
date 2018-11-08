import java.util.*;
class wordmagic
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String s;
s=sc.nextLine();
int l,r1,i,j,k;
l=s.length();
r1=l/2;
j=r1;
int pos=13;
int pos1=pos/3;
int pos2=pos/6;


   for(i=0;i<=r1-1;i++)
   {
   System.out.print(s.charAt(i));
   for(j=pos;j>pos2;j=j--)
   {
       System.out.print(" ");
       continue;
       
       
    }
    
    System.out.print(s.charAt(i));
    System.out.println();
    
    System.out.print(" ");
    pos --;
    
    

}

            

for(i=pos1;i>1;i--)
{
System.out.print(" ");
}
System.out.print(s.charAt(r1));
System.out.println();



for(i=r1+1;i<l;i++)
{
   for(k=pos1;k>1;k=k-2)
   {
       System.out.print(" ");
       if(i==l-1)
       {
           break;
        }
    }
System.out.print(s.charAt(i));
for(j=pos2;j<=pos;j=j+3)
{
System.out.print(" ");
}
pos2 ++;
pos ++;
 System.out.print(s.charAt(i));
 System.out.println();
}   
}
}
   