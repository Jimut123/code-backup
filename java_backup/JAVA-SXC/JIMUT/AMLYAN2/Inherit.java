import java.util.*;
class Inherit
{
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        void input()
        {
                a = sc.nextInt();
                b = sc.nextInt();
        }
        void Sum()
        {
                input();
                c = a+b;
                System.out.println("c = "+c);
        }
}

