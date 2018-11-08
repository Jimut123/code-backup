class HCF
{
  public static void main(int a,int b)
     { int k;int c=0;int d=0;
         if (a>b)
          { c=a;
            d=b;
        }
        else if (b>a)
        { c=b;
          d=a;
        }
        while(c%d!=0)
        { k=c%d;
          c=d;
          c=k;
        }
        System.out.print("HCF"+d);
    }
}
        