import java . io . * ;
class armgstrongg
{
public static void main ( )
{
int i,j,k, s;
for(i=100;i<=999;i++)
{
j=i;
s = 0;
while (j > 0)
{
k = j % 10;
s = s+(k*k*k);
j = j / 10;
}
if(s==i)
System.out.println (i );
}
}

}