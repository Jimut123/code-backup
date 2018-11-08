class Grade
{
  
  public static void main ( int x, int y, int z)
{
int  a , b , c , total;  
a = x ;
  b = y ;
  c = z ;
  total = ( a + b + c) ;
  if ( total < 90 )
  System.out.println ( " FAIL " );
  else
  if ( total < 150 && total > 90 )
  System.out.println ( " PASS " );
  else
  if ( total < 210 && total > 150 )
  System.out.println ( " GOOD " );
  else
  if ( total < 240 && total > 210 )
  System.out.println ( " GRADE A " );
  else
  if ( total > 240 )
  System.out.println ( " SUPER " );
}
}  