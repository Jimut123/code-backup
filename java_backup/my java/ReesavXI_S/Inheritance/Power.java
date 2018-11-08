package Inheritance;
import java.util.*;
class Power extends Factorial
{
    int cal(int x)
    {
        int p=1;
        p=(int)Math.pow(x,x);
        x=super.cal(x);
        return (p/x);
    }
}