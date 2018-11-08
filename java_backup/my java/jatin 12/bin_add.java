import java.io.*;
class bin_add
{//declaration of class
    String a,b,c1;//inisialisation of variables
    int i,c,s,k,m,n;//inisialisation of variables
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void start()throws IOException
    {//declaration of start to input numbers
        System.out.println("Enter 1st Decimal Number:");
        m=Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd Decimal Number:");
        n=Integer.parseInt(br.readLine());
        a=bin(m);
        b=bin(n);
        input();
    }//end of start
    String bin(int m)
    {//declaration of bin to convert the number into binary form and return the value
        int k=0;
        String s;
        s="";
        while(m>0)
        {//loop to convert into binary
            k=m%2;
            if(k==1)
            s="1"+s;
            else
            s="0"+s;
            m=m/2;
        }//end of loop
        return s;
    }//end of bin
    void input()throws IOException
    {//declaration of input to equalise the lengths of both the binary numbers
        if(a.length()>b.length())
        {//loop to equalise the lengths of both the binary numbers
            k=a.length()-b.length();
            i=1;
            while(i<=k)
            {
                b="0"+b;    
                i++;
            }
        }//end of loop
        else
        if(a.length()<b.length())
        {//loop to equalise the lengths of both the binary numbers
            k=b.length()-a.length();
            i=1;
            while(i<=k)
            {
                a="0"+a;
                i++;
            }
        }//end of loop
        System.out.println(a);
        System.out.println(b);
        add();
    }//end of input
    void add()
    {//declaration of add to add the two binary numbers
        c=s=0;
        c1="";
        for(i=a.length()-1;i>=0;i--)
        {//loop to add numbers
            if(a.charAt(i)=='0' && b.charAt(i)=='0' && c==0)
            {//loop to add numbers if both are 0 and carry is also 0
                s=0;
                c=0;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='0' && b.charAt(i)=='0' && c==1)
            {//loop to add numbers if both numbers are 0 and carry is also 1
                s=1;
                c=0;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='1' && b.charAt(i)=='0' && c==1)
            {//loop to add numbers if one number is 1 other is 0 and carry is 1
                s=0;
                c=1;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='1' && b.charAt(i)=='0' && c==0)
            {//loop to add numbers if one number is 1 other is 0 and carry is 0
                s=1;
                c=0;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='0' && b.charAt(i)=='1' && c==0)
            {//loop to add numbers if one number is 0 other is 1 and carry is 0
                s=1;
                c=0;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='0' && b.charAt(i)=='1' && c==1)
            {//loop to add numbers if one number is 0 other is 1 and carry is 1
                s=0;
                c=1;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='1' && b.charAt(i)=='1' && c==1)
            {
                s=1;
                c=1;
                c1=s+c1;
            }//end of loop
            else
            if(a.charAt(i)=='1' && b.charAt(i)=='1' && c==0)
            {//loop to add numbers if both numbers are 1 and carry is also 1
                s=0;
                c=1;
                c1=s+c1;
            }//end of loop
        }//end of for loop
        c1=c+c1;
        System.out.println("The sum is:"+c1);
        System.out.println("The sum in decimal form:"+conv(c1));//printing of result
    }//end of add
    double conv(String s)
    {//declaration of conv to convert the number from binary to decimal
        int a[]=new int[100];//inisialisation of variable
        for(int i=0;i<s.length();i++)
        {//loop to convert the numbers left to the decimal point1
            a[i]=(int)s.charAt(s.length()-1-i);
            a[i]=a[i]-48;
        }//end of loop
        double z=0;
        for(int i=0;i<s.length();i++)
        {//loop to convert the numbers right to the decimal point
            z=z+(a[i]*Math.pow(2,i));
        }//end of loop
        return z;
    }//end of conv
}//end of class