import java.util.*;
public class daydiff
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
int diff1,diff2,diff3;
if(this.yyyy>b.yyyy)
{
diff1=this.yyyy-b.yyyy;
diff2=this.mm-b.mm;
diff3=this.dd-b.dd;
if(diff3<0)
{
diff2=diff2-1;
if(diff2<0)
{
diff2=12-Math.abs(diff2);
diff1=diff1-1;
}
}
}
else
{
diff1=b.yyyy-this.yyyy;
diff2=b.mm-this.mm;
diff3=b.dd-this.dd;
if(diff3<0)
{
diff2=diff2-1;
if(diff2<0)
{
diff1=diff1-1;
}
}
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
