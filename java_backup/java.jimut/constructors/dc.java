class dc
{
    int a,b,c,d;
    dc()
    {
        a=0;
        b=0;
        c=0;
        d=0;
    }
    void display()
    {
        System.out.println(" the values of a,b,c and d are::"+a+','+b+','+c+','+d);
  }
}
class ccj
{
    public static void main(String args[])
    {
        dc ob = new dc();
        ob.display();
    }
}