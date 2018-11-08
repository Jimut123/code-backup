class sample
{
    public static void main(String args[])
    {
        int x=0;
        if(x>=0)
        {
            x=1;
        }
        switch(x)
        {
            case 1:
            System.out.println(1);
            break;
            case 0:
            System.out.println(0);
            break;
            case 2:
            System.out.println(2);
            break;
            case 3:
            System.out.println(3);
            break;
            default:
            System.out.println(4);
        }
    }
}