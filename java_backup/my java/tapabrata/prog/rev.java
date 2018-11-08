package prog;
public class rev
{ public int fun(int n)
{
int s=0;
do{
int k=n%10;

s=s*10+k;
n=n/10;

}while(n>0);
return s;
}
}