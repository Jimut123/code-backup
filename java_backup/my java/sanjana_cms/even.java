class even
{
    public static void main()
{
  int s,si,i;
    s=si=0;
        for (i=10; i<=100; i+=1)
        {
        if (i%2==0)
        s=s+i;
        else
        si=si+i;
    }
    System.out.println(s);
    System.out.println(si);
}
}
