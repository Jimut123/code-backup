import java.util.*;
class DAYDIFF
{
int dd=0,mm=0,yyyy=0;
DAYDIFF(int x,int y,int z)
{
dd=x;
mm=y;
yyyy=z;
}
void cal()
{
Scanner sc=new Scanner(System.in);
int dd=0,mm=0,yyyy=0;
int diff=0,diff2=0,diff3=0,diff4=0;
System.out.println("enter day");
dd=sc.nextInt();
System.out.println("enter month");
mm=sc.nextInt();
System.out.println("enter year");
yyyy=sc.nextInt();
if(this.dd>dd)
diff=this.dd-dd;
else if(dd>this.dd)
diff=dd-this.dd;
elsez
diff=0;
if(this.mm>mm)
diff2=this.mm-mm;
else if(mm>this.mm)
diff2=mm-this.mm;
else
diff2=0;
if(this.yyyy>yyyy)
diff3=this.yyyy-yyyy;
else if(yyyy>this.yyyy)
diff3=yyyy-this.yyyy;
else
diff3=0;
if(diff2<12)
{
diff3=diff3-1;
diff2=12-diff2;
}
System.out.println("day diff   month diff   year diff");
System.out.println("   "+diff+"            "+diff2+"         "+diff3);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
DAYDIFF obj=new DAYDIFF(19,8,1996);
DAYDIFF obj1=new DAYDIFF(19,8,1996);
obj.cal();
}
}