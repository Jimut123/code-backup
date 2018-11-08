import java .io.*;
class Decode
{
 public static void main(String args[])throws IOException
 { String s,w;int i;int j;int k;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter The String");
     s=br.readLine ();
     System.out.println("Enter The Shift Number");
     int c=Integer.parseInt(br.readLine());
     if(c>26)
     {
         System.out.println("INVALID ENTRY");
         System.exit(0);
     }           
       w="";
 for(i=0;i<s.length();i++)
 {
     int m=(int)s.charAt(i);
     m=m+(c-1);
     
     
     if(m>122)
     {
         m=m-122;
         k=97;
         for(j=1;j<m;j++)
         {
         
         k++;
        }
        w=w+(char)k;
     }
     else
     if(m>90)
     {
         m=m-90;
         k=65;
         for(j=1;j<m;j++)
         {
         
         k++;
        }
        w=w+(char)k;
     }
     else
     if((char)m=='Q'||((char)m=='q'))
     {
         if(s.charAt(i+1)=='K'||s.charAt(i+1)=='k'||s.charAt(i+1)=='G'||s.charAt(i+1)=='g')
     {
         w=w+" ";
     i=i+1;
    }
    }
     else
     w=w+(char)m;
    
 }
 System.out.println(w);
}
}
             
 


