class bank
{
    public static void main (int p, int t, int i)
    {
        int a;
        switch (i)
        {
            case 1 : a=p+((int)Math.pow ((1+7/100),t))/2;
            System.out.println (a);
            break;
            case 2 : a=p+(int)Math.pow ((1+8/100),t);
            System.out.println (a);
            break;
            case 3 : a=p+(int)Math.pow ((1+9/100),t);
            System.out.println (a);
            break;
            case 4 : a=p+(int)Math.pow ((1+10/100),t);
            System.out.println (a);
            break;
        }
    }
}