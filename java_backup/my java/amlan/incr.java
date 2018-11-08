

class incr
{
 public static void main(String args[])
 {
     int x,y,z;
     x=7;
     y=5;
     z=x-- + ++y;
     System.out.println(z);
     x=7;
     y=5;
     z=--x + ++y;
     System.out.println(z);
     x=7;
     y=5;
     z=--x + y--;
     System.out.println(z);
     x=7;
     y=5;
      z=--x + --y;
     System.out.println(z);
     x=7;
     y=5;
      z=--x + x++ - (--y + y--);
     System.out.println(z); 
    x=5;
     y=7;
      x= x++ - --y + y++ + --x + x-- + y-- ;
     System.out.println(x);  
}
}
