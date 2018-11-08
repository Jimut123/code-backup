class Checkc
{
  public static void main ( int x , int y , int z )
{
  double c;
  
  c = 0;
  if (x > 10)
  c = (x * x) + (y * y) + (z*z) ;
  else
  if ( x < 10)
  c = Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2);
  System.out.println (" Result is " + c);
}
}  