//decimal to hexadecimal
class DecimalToHexadecimal
{
  String a[]={"A","B","C","D","E","F"};
  public void convertInt(double dNo)
   {
       int d=(int)dNo;
       int i,j=d;
       String hNo="",str;
       while(j>0)
       {
           j=d/16;
           i=d%16;
           if (i>9)
           {
               int r=i%10;
               hNo=hNo+a[r];
            }
            else
            {
                str=Integer.toString(i);
                hNo=hNo+str;
            }
            d=j;
        }
        show(hNo,dNo);
    }
    public void show(String hNo,double dNo)
    {
        int l=hNo.length();
        System.out.println("decimal no.="+dNo);
        System.out.print("hexadecimal equivalent=");
        for (int i=l-1;i>=0;i--)
          System.out.print(hNo.charAt(i));
        int n=(int)dNo;
        double d=dNo-(double)n;
        if(d!=0)
        {
            System.out.print(".");
            convertFloat(d);
        }
    }
    public void convertFloat(double d)
    {
        int c=0;
        while (d>0)
        {
            int p=(int)(d*16);
            if (p>9)
            {
                int r=p%10;
                System.out.print(a[r]);
            }
            else
             System.out.print(p);
            d=(d*2)-(double)p;
            c++;
            if (c>3)
             break;
            }
        }
    }
          
        
       