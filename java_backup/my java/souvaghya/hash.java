class hash
{
public static void main(String args[])
{
int i;int j;
char ch;
for(i=5;i>=1;i--)
{
if(i%2==0)
ch='*';
else
ch='#';
for(j=1;j<=i;j++)
{
System.out.print(ch);
if(ch=='*')
ch='#';
else
ch='*';
}
System.out.println(" ");
}
}
}