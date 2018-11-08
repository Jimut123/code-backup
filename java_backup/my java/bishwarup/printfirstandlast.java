class printfirstandlast
{
public static void main(int n)
{
int s=0,i;
System.out.println("Original No is:"+n);
System.out.println("Last Digit:"+n%10);
i=0;
while(n>0)
{
i=n%10;
n=n/10;
}
System.out.print("First Digit:"+i);
}
}