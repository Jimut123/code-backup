class output
{
public static void main (String args[])
{
int a=10,b=11,c=12;
int s,o,p;
s=++a + a++ + --a+ ++a;
o=++a + ++b + ++c + --a + --b + --c ;
p=++a + --a+ ++a + --a;
System.out.print("s="+s);
System.out.print("o="+o);
System.out.print("p="+p);
}
}