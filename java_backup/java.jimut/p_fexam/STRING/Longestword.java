package STRING;


class Longestword
{
public static void main(String[]args)
{
String sen;
int i,s,l,max=0;
sen=s;
sen=sen+"";
l=sen.length();
for(i=0;i<l;i++)
{
String w="";
while(sen.charAt(i)!=' ')
{
w=w+sen.charAt(i);
i++;
}
if(w.length()>max)
{
max=w.length();
}
}
System.out.println(max);
}
}