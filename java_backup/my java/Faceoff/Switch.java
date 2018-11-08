class Switch
{
    public static void main ( int x,int a, int b)
    
    {int c;
        System.out.println("press 1 for addition of two numbers");
        System.out.println("press 2 for substratction of two numbers");
        System.out.println("press 3 for swapping of two numbers");
        
        switch(x)
        {
            case 1:c=a+b;
                   System.out.println(c);
                   break;
            case 2:c=a-b;
                   System.out.println(c);
                   break;
            case 3:c=a;
                   b=a;
                   System.out.println(c);
                   System.out.println(b);
            default:System.out.println("not valid");
        }
    }
}
        