package Inheritance;
import java.util.*;
class Factorial
{
    int cal(int x)
    {
        int f=1;
        while(x>0)
        {
            f=f*(x--);
        }
        return f;
    }
}