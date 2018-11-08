import java.util.*;

class FreshJuice 
{
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE};
    FreshJuiceSize size;
}

public class FreshJuiceTest 
{
    Scanner sc = new Scanner(System.in);
    public static void main() 
    {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println("Size: " + juice.size);
    }
}