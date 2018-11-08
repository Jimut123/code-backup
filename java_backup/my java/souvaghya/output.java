
class output
{
 public static void main(String args[])
 {
     int a,b,c;
     b=10;
     c=5;
     a=++b + b++ + --b+ b-- + b;
     System.out.println(a);
     a=++b + b++ + --b+ b-- + b/c;
     System.out.println(a);
    }
}
