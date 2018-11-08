import java.io.*;
class question_eighteen
{
  public static void main()throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   String s,w;int l,j,f,i;
   System.out.print("enter a sentence");
   s=br.readLine();
   l=s.length();
   f=0;
   w="";
   w=w+s.charAt(0);
   for(i=0;i<l;i++)
    {if(s.charAt(i)==' ')
       w=w+s.charAt(i+1);
    }
    j=w.length()-1;
   for(i=0;i<w.length()/2;i++,j--) 
   {
       if(w.charAt(i)!=w.charAt(j))
       {
           f=1;
           break;
        }
        
    }
    if(f==0)
    System.out.println("Palindrom:"+w);
    else
    System.out.println("Non Palindrom:"+w);
}}
    
       