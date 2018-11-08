import java.util.*;
public class add extends date2 implements date1
{
    int yr,mn,dy;
    Scanner sc=new Scanner(System.in);
    public void cal()
    {
        yr=k/366;
        mn=(k-yr*366)*12;
        dy=k-mn*30;
        dy+=d;
        mn+=m+dy%30;
        yr+=mn/12;
        mn=mn%12;
        System.out.println("The date:"+dy+":"+mn+":"+yr);
    }
}
        
    