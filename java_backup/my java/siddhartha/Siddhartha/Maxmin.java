class Maxmin
{
public static void main(int n)
{
  int i,j,h,g,s,a,m,k;
  j=0;h=0;k=0;a=0;
  for(i=n;i>=n;i=i/10)
  {
     j=i%10;
    break;
    }
   for(s=i;s>=i;s=s/10)
   {
       h=s%10;
    break;
    }
    for(g=s;g>=h;g=g/10)
    {
        a=g%10;
        break;
    }
    for(m=g;m>=a;m=m/10)
    {
        k=m%10;
        break;
    }
    if((j>h)&&(j>a)&&(j>k))
    System.out.println(j);
    else if((h>j)&&(h>a)&&(h>k))
     System.out.println(h);
     else if((a>j)&&(a>h)&&(a>k))
        System.out.println(a);
        else
           System.out.println(k);
        }
    }

        