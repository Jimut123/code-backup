import java.io.*;
class Pre_board_Question_3_String
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader ab = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(ab);
        String s,m="",t1,f;
        int l,i,c=0,d=0,as,pot=0,min,t,j;
        char ch;
        System.out.println("Enter the string : ");
        s=cd.readLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch==' ')||(ch=='.')||(ch=='?')||(ch=='!'))
            {
                c++;
            }
            
        }
        String a[]=new String[c];
        int pot1[]=new int[c];
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            if((ch!=' ')&&(ch!='.')&&(ch!='?')&&(ch!='!'))
            {
                m=m+ch;
            }
            else
            {
                
                a[d]=m;
                m="";
                d++;
            }
        }
        for(i=0;i<c;i++)
        {
            f=a[i];
            
            for(j=0;j<f.length();j++)
            {
                ch=f.charAt(j);
                as=(int)ch-64;
                pot=pot+as;
            }
            
            pot1[i]=pot;
            pot=0;
        }
         for(i=0;i<c;i++)
        {
             System.out.println(a[i]+" = "+pot1[i]);
        }
        for(i=0;i<c-1;i++)
        {
            min=i;
            for(j=i+1;j<c;j++)
            {
                if(pot1[min]>pot1[j])
                {
                    min=j;
                }
            }
            t=pot1[i];
            pot1[i]=pot1[min];
            pot1[min]=t;
            t1=a[i];
            a[i]=a[min];
            a[min]=t1;
        }
        for(i=0;i<c;i++)
        {
             System.out.print(a[i]+" ");
        }
        System.out.print(".");
         System.out.println();
    }
}
        
        
        
        
        
        
        