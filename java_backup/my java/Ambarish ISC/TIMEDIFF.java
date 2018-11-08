import java.util.*;
class TIMEDIFF
{
int hr=0,min=0,sec=0;
TIMEDIFF(int x,int y,int z)
{
hr=x;
min=y;
sec=z;
}
void cal()
{
Scanner sc=new Scanner(System.in);
int hr=0,min=0,sec=0;
int diff=0,diff2=0,diff3=0,diff4=0;
System.out.println("enter hour");
hr=sc.nextInt();
System.out.println("enter minute");
min=sc.nextInt();
System.out.println("enter seconds");
sec=sc.nextInt();
if(this.hr>hr)
diff=this.hr-hr;
else if(hr>this.hr)
diff=hr-this.hr;
else
diff=0;
if(this.min>min)
diff2=this.min-min;
else if(min>this.min)
diff2=min-this.min;
else
diff2=0;
if(this.sec>sec)
diff3=this.sec-sec;
else if(sec>this.sec)
diff3=sec-this.sec;
else
diff3=0;
System.out.println("hour diff   minute diff   sec diff");
System.out.println("   "+diff+"            "+diff2+"         "+diff3);
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
TIMEDIFF BD=new TIMEDIFF(19,8,1996);
TIMEDIFF BD1=new TIMEDIFF(19,8,1996);
BD.cal();
}
}