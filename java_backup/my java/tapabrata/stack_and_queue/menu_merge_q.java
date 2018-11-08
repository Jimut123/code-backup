package stack_and_queue;
import java.util.Scanner;
class menu_merge_q
{
public static void main()
{
Scanner ob=new Scanner(System.in);
merge_q s=new merge_q();
do
{
System.out.println("press 1 for insert in 1st queue \npress 2 for delete from 1st queue ");
System.out.println("press 3 for insert in 2nd queue \npress 4 for delete from 2nd queue ");
System.out.println("press 5 for merging");
System.out.println("press 6 for insert in merged queue \npress 7 for delete from merged queue ");
System.out.println("press 8 for display merged queue \npress 9 for display 1st queue \npress 10 for display 2nd queue ");
System.out.println("press 11 for exit\n");
int x=ob.nextInt();
System.out.println("");
switch(x)
{
case 1: s.insert1();
        break;
case 2: s.delete1();        
        break;
case 3: s.insert2();
        break;
case 4: s.delete2();        
        break;
case 5: s.merge();
        break;
case 6: s.insert_merge();
        break;
case 7: s.delete_merge();        
        break;        
case 8: s.disp_merge();
        break;
case 9: s.disp_1();
        break;        
case 10: s.disp_2();
        break;
case 11:System.exit(0);        
default: System.out.println("give input from among the menu integers");
}
}while(true);
}
}




