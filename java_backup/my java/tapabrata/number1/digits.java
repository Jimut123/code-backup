package number1;
public class digits
{
//int k;
public int count(int n)
{
int k;
int c=0;
while(n>0)
{k=n%10;
c++;
n=n/10;
}
//k=5;
return c;
}
}
