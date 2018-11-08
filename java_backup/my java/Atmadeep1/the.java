import java.io.*;
class the
{
public static void main(String args[])throws IOException
{

int i,j;

String s,w1="",w2="the",w3="The",w4="THE";

char ch;

BufferedReader input=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter sentence: ");

s=input.readLine();

for(i=0;i<s.length();i++)
{

 ch=s.charAt(i);

  if((ch=='t')||(ch=='T'))
  {

   for(j=i;j<=i+2;j++)
   {

    w1=w1+s.charAt(j);

   }
   if((w1.compareTo(w2)==0)||(w1.compareTo(w3)==0)||(w1.compareTo(w4)==0))
   {

     if(w1.compareTo(w2)==0)
     {

      System.out.print("then");

     }
     else
     if(w1.compareTo(w3)==0)
     {

      System.out.print("Then");

     }
     else
     if(w1.compareTo(w4)==0)
     {

      System.out.print("THEN");

    }
   w1="";
   i=i+2;
  }
  else
   {
   System.out.print(ch);
   w1="";
   }
  }
  else
  {
  System.out.print(ch);
  }
}
}
}


