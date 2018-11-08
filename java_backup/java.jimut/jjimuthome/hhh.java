import java . io . * ;
public class patternn
{
public static void main ( String args [] )
{
int k,i,j;
k = 5;
for (i = 1 ; i <= 5; i++)
{
for (j = 1 ; j <= i ; j++ )
{
System.out.print( k );
k++;
}
k=5-i;
System.out.println ( "" );
}
}
}