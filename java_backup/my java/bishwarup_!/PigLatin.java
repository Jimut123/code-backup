
class PigLatin
{
public static void main(String s)
{
int a,i,j;
a=0;
System.out.println("piglatin string:");
for(i=0;i<s.length();i++)
{
if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
{
a=i;
break;
}
}
for(j=a;j<s.length();j++)
System.out.print(s.charAt(j));
for(i=0;i<a;i++)
System.out.print(s.charAt(i));
System.out.print("AY");
}
}
