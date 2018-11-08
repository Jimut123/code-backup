class Discount
{
  public static void main ( int a ,int discount1 )
{  
  if ( a <= 10000 )
  discount1 = ( a * 10 )/100;
  else
  if ( a <= 30000 )
  discount1 = ( a * 15 )/100;
  else
  if ( a <= 50000 )
  discount1 = ( a * 25 )/100;
  else
  if ( a > 50000 )
  discount1 = ( a * 30 )/100;
  System.out.println ( " Discount is: " + discount1 );
}
}  
  