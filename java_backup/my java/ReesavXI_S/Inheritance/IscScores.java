package Inheritance;
import java.util.*;
class IscScores
{
    int number[][]=new int[6][2];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            for(int j=0;;)
            {
                System.out.print("Enter the subject code ");
                number[i][j++]=sc.nextInt();
                System.out.print("Enter the subject marks ");
                number[i][j]=sc.nextInt();
                break;
            }
        }
    }
    int point(int x)
    {
        if(x>=90)
        return 1;
        else if(x>80&&x<90)
        return 2;
        else if(x>70&&x<80)
        return 3;
        else if(x>60&&x<70)
        return 4;
        else if(x>50&&x<60)
        return 5;
        else if(x>40&&x<50)
        return 6;
        else
        return 7;
    }
}
                