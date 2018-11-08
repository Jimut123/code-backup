class Average
{
public static void main ( int a, int b, int c )
{  
 int  sum, avg ;
 sum = a + b + c;
 avg = ( a + b + c )/3;
 if ( avg < 30 )
 System.out.println ( " grade f " );
 else
 if ( avg < 60 )
 System.out.println ( " grade d " );
 else
 if ( avg < 80 )
 System.out.println ( " grade b " );
 else
 if ( avg < 90 )
 System.out.println ( " grade a " );
 else
 if ( avg >= 90 )
 System.out.println ( " grade s " );
}
}
 
 