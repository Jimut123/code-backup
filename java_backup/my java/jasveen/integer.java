class integer
{
    public static void main(int a,int b,int x)
    {
        int s;
        System.out.println("press 1 for sum");
        System.out.println("press 2 for product");
        System.out.println("press 3 for average");
        switch(x)
        {
            case 1:
            s=a+b;
            System.out.println(s);
            break;
            case 2:
            s=a*b;
            System.out.println(s);
            break;
            case 3:
            s=(a+b)/2;
            System.out.println(s);
            break;
            default:
            System.out.println("error");
        }
    }
}
        
        