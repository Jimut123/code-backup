//log in duration
import java.util.*;
class MachineUsageMain
{
    public static void main(String args[])
    {
        MachineUsage obj=new MachineUsage();
        obj.get();
    }
}
class MachineUsage
{
   int id[]=new int[100];
   String inTime[]=new String[100];
   String inDate[]=new String[100];
   String outTime[]=new String[100];
   String outDate[]=new String[100];
   String duration[]=new String[100];
   Scanner sc=new Scanner(System.in);
   int n,c;
   public void get()
   {
       int i;
       System.out.println("number of users : ");
        n=sc.nextInt();
       System.out.println("User     Login          Logout");
       System.out.println("     Time    Date   Time    Date");
       for(i=0;i<n;i++)
       {
           id[i]=sc.nextInt();
           inTime[i]=sc.next();
           inDate[i]=sc.next();
           outTime[i]=sc.next();
           outDate[i]=sc.next();
        }
        calc();
    }
    public void show()
    {
        int i;
        System.out.println("User     Login          Logout      Duration");
        System.out.println("     Time    Date   Time    Date");   
        for(i=0;i<n;i++)
        {
            System.out.println(id[i]+" "+inTime[i]+"    "+inDate[i]+"   "+outTime[i]+"    "+outDate[i]+"    "+duration[i]);
        }
        System.out.println("The user who logged in for the maximum diration : ");
        System.out.println(id[c]+" "+inTime[c]+"    "+inDate[c]+"   "+outTime[c]+"    "+outDate[c]+"    "+duration[c]);
    }
    public void calc()
    {
        int i,t1,t2,d1,d2,dur,dif,max=0;
        String str;
        for(i=0;i<n;i++)
        {
            t1=conTime(inTime[i],':');
            t2=conTime(outTime[i],':');
            d1=conDate(inDate[i],'-');
            d2=conDate(outDate[i],'-');
            dur=(d2-d1)*24*60;
            dif=Math.max(t1,t2)-Math.min(t1,t2);
            if (t2>t1)
             dur=dur+dif;
            else
             dur=dur-dif;
            if (dur>max)
            {
                max=dur;
                c=i;
            }
            str=Integer.toString(dur/60)+":"+Integer.toString(dur%60);
            duration[i]=str;
        }
        show();
    }
    public int conTime(String s,char ch)
    {
        int p,t;
        String s1,s2;
        p= s.indexOf(ch);
        s1=s.substring(0,p);
        s2=s.substring(p+1);
        t=Integer.parseInt(s1)*60+Integer.parseInt(s2);
        return t;
    }
    public int conDate(String s,char ch)
    {
        int p,d;
        String s1;
        p=s.indexOf(ch);
        s1=s.substring(0,p);
        d=Integer.parseInt(s1);
        return d;
    }
}



        
        
        