class program
{
    public static void main()
    {
      int i;
      int s=0;
      int p=1;
      for(i=5;i<=20;i++)
      {
          if(s%i==0)
          s=s+i;
          else
          if(p%i=!0)
          p=p*i;
        }
        System.out.println(s);
        System.out.println(p);
    }
}