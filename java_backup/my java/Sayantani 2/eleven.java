

 class eleven
{
  public static void main(int n)
  {
      int c,s,s1,k;
      c=0;
      s=0;
      s1=0;
      while(n>0)
      {
          k=n%10;
          c=c+1;
          if(c%2!=0)
          s=s+k;
          else
          s1=s1+k;
          n=n/10;
        }
         
        if(s-s1==0)
        System.out.println("divisible");
        else
 System.out.println("noy divisible");
    }
}
