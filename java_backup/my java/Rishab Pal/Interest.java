class Interest
{
    public static void main (int x,int y,int z)
    {
       int p =x;
       int r =y;
       int t =z;
       double ci =(double)p*Math.pow((1+(r/100)),t);
        System.out.println ("Calculate compound interest" +ci);
    }
}