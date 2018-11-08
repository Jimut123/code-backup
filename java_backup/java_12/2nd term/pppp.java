import java.io.*;
class pppp
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",lp;
        int i,c=0,l,pot=0,g,min,d,t,j;
        char ch;
        System.out.println("Enter a sentence : ");
        s=cd.readLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch=='.')||(ch=='!')||(ch=='?')||(ch==' '))
            {
                c++;
            }
            
        }
        System.out.println(c);
        String b[]=new String[c];
        int a[]=new int[c];
        d=c;
        c=0;
         for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch!='.')&&(ch!='!')&&(ch!='?')&&(ch!=' '))
            {
                m=m+ch;
                g=(int)ch-64;
                pot=pot+g;
               
            }
            else
            {
                b[c]=m;
                a[c]=pot;
                c++;
                System.out.println(m+"\t"+pot);
                pot=0;
                m="";
                 
            }
        }
        for(i=0;i<d-1;i++)
        {
               min=i;
               for(j=i+1;j<d;j++)
               {
               if(a[min]>a[j])
                {
                min=j;
               }
               }
               t=a[i];
               a[i]=a[min];
               a[min]=t;
               lp=b[i];
               b[i]=b[min];
               b[min]=lp;
         }
         for(i=0;i<d;i++)
         {
             System.out.print(b[i]+" ");
            }
            System.out.print(".");
            System.out.println();
        }
        
    }
        
        
        
        
        
        
        
        