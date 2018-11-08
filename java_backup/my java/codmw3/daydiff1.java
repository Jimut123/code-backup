import java.util.*;
public class daydiff1
{
int dd,mm,yyyy;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter year");
yyyy=sc.nextInt();
System.out.println("enter month");
mm=sc.nextInt();
System.out.println("enter day");
dd=sc.nextInt();
}
void cal(daydiff b)
{
int diff1,diff2,diff3=0;

if(b.yyyy>this.yyyy)
{
diff1=b.yyyy-this.yyyy;
diff2=b.mm-this.mm;

}
else
{
diff1=this.yyyy-b.yyyy;
diff2=this.yyyy-b.yyyy;

}
if(diff2<0)
{
diff1=diff1-1;
}

System.out.println("Difference is "+diff1+"years" +Math.abs(diff2)+ "months" +Math.abs(diff3)+ "days");

}
 public static void main()
 {
     daydiff a=new daydiff();
     daydiff obj=new daydiff();
     a.input();
     obj.input();
     a.cal(obj);
    }
}
