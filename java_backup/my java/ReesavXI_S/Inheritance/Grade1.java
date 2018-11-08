package Inheritance;
import java.util.*;
class Grade1 extends Marks
{
    String grade="";
    void calc()
    {
        super.insert();
        tot/=3;
        if(tot>85)
        System.out.print("Percentage 85%+");
        else if(tot>75)
        System.out.print("Percentage 75%+");
        else if(tot>65)
        System.out.print("Percentage 65%+");
        else if(tot>55)
        System.out.print("Percentage 55%+");
    }
}    