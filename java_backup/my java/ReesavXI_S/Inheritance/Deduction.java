package Inheritance;
import java.util.*;
class Deduction extends Allowance
{
    int tax,pfund;
    void deduce()
    {
        super.cal();
        tax=(10/100)*BASIC;
        pfund=(12/100)*BASIC;
    }
    void deduce_show()
    {
        super.display();
    }
}