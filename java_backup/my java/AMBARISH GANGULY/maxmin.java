class maxmin
{
  public static void main(int n)
  {
     int max;int min;int k;
     max=min=n%10;
     while(n>0)
     {
         k=n%10;
         if(k>max)
         {
             max=k;
            }
            else
            if(k<min)
            {
                min=k;
            }
            n=n/10;
        }
        System.out.println("Max"+max);
        System.out.println("Min"+min);
    }
}
     