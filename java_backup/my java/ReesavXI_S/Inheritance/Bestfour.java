package Inheritance;
import java.util.*;
class Bestfour extends IscScores
{
    void bestsubjects()
    {
        super.input();
        int points=0;
        for(int i=0;i<6;i++)
        {
            points+=point(number[i][0]);
        }
        System.out.print("Total points "+points);
    }
}
