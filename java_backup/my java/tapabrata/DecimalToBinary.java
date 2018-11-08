//decimal to binary
class DecimalToBinary
{
  
  public void convertInt(double dNo)
   {
       int d=(int)dNo;
       int i,j=d;
       String bNo="",str;
       while(j>0)
       {
           j=d/2;
           i=d%2;
           str=Integer.toString(i);
           bNo=bNo+str;
           d=j;
        }
        show(bNo,dNo);
    }
    public void show(String bNo,double dNo)
    {
        int l=bNo.length();
        System.out.println("decimal no.="+dNo);
        System.out.print("binary equivalent=");
        for (int i=l-1;i>=0;i--)
          System.out.print(bNo.charAt(i));
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
            int p=(int)(d*2);
            System.out.print(p);
            d=(d*2)-(double)p;
            c++;
            if (c>3)
             break;
            }
        }
    }
          
        
       