import java.util.*;
class Inherit1 extends Inherit
{
        int x,y,z;
        void input1()
        {
                Scanner sc = new Scanner(System.in);
                x = sc.nextInt();
                y = sc.nextInt();
        }
        void Sum1()
        {
                super.Sum();
                z = x+y;
                System.out.println("z = "+z);
        }

        public static void main(String[] args)
        {
                Inherit1 ob = new Inherit1();
                ob.input1();
                ob.Sum1();
        }
}
