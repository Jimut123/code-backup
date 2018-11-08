
public class hcalcm
{
 public static void findlcm(int a ,int b,int k)
 {
  if((a*k)%b==0)
  System.out.println(a*k);
  else
  {
   k=k+1;
   findlcm(a ,b,k);
   }
   }
    public static void findhcf(int a ,int b)
    {
     int k=a%b;
     if(k!=0)
     findhcf(b,k);
     else if(k==0)
     System.out.println(b);
     }
   
   
   }
   
    