class Display
{
  String name ;
  public void show ( String s )
{
  name =s ;
  for ( int i = 1 ; i <= 50 ; i++ )
  System.out.println ( name ) ;
}
  public static void main ( String s [] )
{
  Display dis = new Display () ;
  dis.show ( "SAYANTANI" ) ;
}
}  