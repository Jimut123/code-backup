public class Function
{
    public static int y = 20;
    public static int x = 10;
    /**
     * Method Demo
     */
    public void Demo()
    {
        System.out.println("VALUES INITIALLY :   x = "+x+"  ,  y = "+y);
        SwapCallbyValue(x,y);
        System.out.println("VALUES AFTER SwapCallbyValue METHOD :   x  = "+x+"  ,  y = "+y);
        Function object = new Function();
        SwapCallbyReference(object);
        System.out.println("VALUES AFTER SwapCallbyReference METHOD :   x  = "+x+"  ,  y = "+y);
    }

    /**
     * Method SwapCallbyValue
     */
    public static void SwapCallbyValue(int a,int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("VALUES INSIDE SwapCallbyValue METHOD :   x  = "+a+"  ,  y = "+b);//THANK YOU 
        // METHOD TO DEMONSTRATE SWAP BY CALL METHOD.
    }

    /**
     * Method SwapCallbyReference
     */
    public static void SwapCallbyReference(Function obj)
    {
        int temp;
        temp = obj.x;
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
        System.out.println("VALUES INSIDE SwapCallbyReference METHOD :   x  = "+obj.x+"  ,  y = "+obj.y);//THANK YOU 
        // METHOD TO DEMONSTRATE SWAP BY CALL REFERENCE. 
    }
}