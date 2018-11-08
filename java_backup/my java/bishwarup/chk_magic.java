class chk_magic
{
public static void main(int n)
{
int n1=n,p,s,k;
if(n1==1)
System.out.print(n+" is a magic number");
else
{
while(n1>=10)
{
p=n1;
s=0;
while(p>0)
{
k=p%10;
s=s+k;
p=p/10;
}
n1=s;
}
if(n1==1)
System.out.print(n+" is a magic number");
else
System.out.print(n+" is not a magic number!!!!!");
}
}
}



/*
 *                 LISTING
 * variable     type            description
 * n            int             stores the number
 * n1           int             stores the copy of the number
 * p            int             stores the copy of the number
 * s            int             stores sumation value
 * k            int             stores the digits
 */