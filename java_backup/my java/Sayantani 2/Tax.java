class Tax
{
  public static void main ( int i )
{
  int tax;  
  tax = 0;
if ( i <= 100000 )
  tax = 0;
  else
  if ( i <=250000 && i > 100000 )
  tax = ( 10 / 100 ) * i;
  else
  if ( i <= 500000 && i > 250000 )
  tax = ( 11 / 100 ) * i + 5000;
  else
  if ( i <= 1000000 && i > 500000 )
  tax = ( 15 / 100 ) * i + 8000;
  else
  if ( i > 1000000 )
  tax = ( 20 / 100 ) * i + 10000;
  System.out.println ( " Tax is " + tax );
}
}  
  