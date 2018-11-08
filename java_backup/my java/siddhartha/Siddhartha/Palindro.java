class Palindro
{
public static void main(int n)
{
 int a,g,s,i,j,k,fd;
 s=0;
 i=n;
 while(i>0)
 {
     j=i%10;
     s=(s*10)+j;
     i=i/10;
    }
    if(s==n)
    System.out.println("Palindrome");
else
System.out.println("Not Palindrome");

}
}