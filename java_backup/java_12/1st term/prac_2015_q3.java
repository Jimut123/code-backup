import java.io.*;
class prac_2015_q3
{
public static void main (String args [])throws IOException
{
InputStreamReader ab = new InputStreamReader(System.in);
BufferedReader cd = new BufferedReader(ab);
String s,m="",t,s1="",s2="";
char ch,c,c2;
int l,k=0,i,c1=0,j,l1,v=0,con=0,q;
System.out.println("Enter a single sentence.");
s=cd.readLine();
l=s.length();
c = s.charAt(l-1);
if((c=='?')||(c=='.'))
{
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    if(ch==' ')
    {
        c1=c1+1;
    }
}
String a[]=new String[c+1];
int vow[]=new int[c+1];
int cons[]=new int[c+1];
for(i=0;i<l;i++)
{
    ch=s.charAt(i);
    
    if((ch!=' ')&&(ch!='.')&&(ch!='?'))
    {
        m=m+ch;
    }
    else
    {
        if(s2=="")
       {
        c=Character.toUpperCase(m.charAt(0));
        s2=s2+c;
      }
        l1=m.length();
        for(j=0;j<l1;j++)
        {
            c2=m.charAt(j);
            if((c2=='A')||(c2=='E')||(c2=='I')||(c2=='O')||(c2=='U')||(c2=='a')||(c2=='e')||(c2=='i')||(c2=='o')||(c2=='u'))
            {
                v++;
            }
            else
            {
                con++;
            }
        }
       l1=m.length();
         for(j=1;j<l1;j++)
            {
                c2=m.charAt(j);
                s2+=c2;
             }
         a[k]=s2;
        vow[k]=v;
        v=0;
        cons[k]=con;
        con=0;
        m="";
        k++;
        s2="";
    }
}
q=k--;
System.out.println("Word \t\t Vowels \t\t Consonants.");
for(i=0;i<q;i++)
{
    System.out.println(a[i]+"\t\t"+vow[i]+"\t\t"+cons[i]);
}

}
else
{
     System.out.println("Invalid Input.");
}
}
}
    