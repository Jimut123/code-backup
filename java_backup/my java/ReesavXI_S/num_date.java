import java.util.*;
class num_date
{
int date;
num_date(int x)
{
date=x;
}
void cal()
{
int yyyy=0,mm=0,dd=0,dif=0,ch=0,ch1=0,ch2=0,ch3=0;
yyyy=date%10000;
date=date/10000;
mm=date%100;
date=date/100;
dd=date%100;
date=0;
if(dd>30&&dd<32)
{
ch=mm;
switch(ch)
{
case 1:
System.out.println(dd+", Janaury ,"+yyyy);
break;
case 2:
dif=dd-28;
System.out.println(dif+", March ,"+yyyy);
break;
case 3:
System.out.println(dd+", March ,"+yyyy);
break;
case 4:
dif=dd-30;
System.out.println(dif+", May ,"+yyyy);
break;
case 5:
System.out.println(dd+", May ,"+yyyy);
break;
case 6:
dif=dd-30;
System.out.println(dif+", July ,"+yyyy);
break;
case 7:
System.out.println(dd+", July ,"+yyyy);
break;
case 8:
System.out.println(dd+", August ,"+yyyy);
break;
case 9:
dif=dd-30;
System.out.println(dif+", October ,"+yyyy);
break;
case 10:
System.out.println(dd+", October ,"+yyyy);
break;
case 11:
dif=dd-30;
System.out.println(dif+", December ,"+yyyy);
break;
case 12:
System.out.println(dd+", December ,"+yyyy);
break;
default:
System.out.println("Month - WRONG INPUT.... Please check and try again....");
}
}
else if(dd==30)
{
ch1=mm;
switch(ch1)
{
case 1:
System.out.println(dd+", Janaury ,"+yyyy);
break;
case 2:
dif=dd-28;
System.out.println(dif+", March ,"+yyyy);
break;
case 3:
System.out.println(dd+", March ,"+yyyy);
break;
case 4:
System.out.println(dd+", April ,"+yyyy);
break;
case 5:
System.out.println(dd+", May ,"+yyyy);
break;
case 6:
System.out.println(dd+", June ,"+yyyy);
break;
case 7:
System.out.println(dd+", July ,"+yyyy);
break;
case 8:
System.out.println(dd+", August ,"+yyyy);
break;
case 9:
System.out.println(dd+", September ,"+yyyy);
break;
case 10:
System.out.println(dd+", October ,"+yyyy);
break;
case 11:
System.out.println(dd+", November ,"+yyyy);
break;
case 12:
System.out.println(dd+", December ,"+yyyy);
break;
default:
System.out.println(" WRONG INPUT.... Please check and try again....");
}
}
else if(dd==29)
{
ch2=mm;
switch(ch2)
{
case 1:
System.out.println(dd+", Janaury ,"+yyyy);
break;
case 2:
if(yyyy%4==0||yyyy%400==0)
System.out.println(dd+", February ,"+yyyy+"Its a leap year");
else
{
dif=dd-28;
System.out.println(dif+", March ,"+yyyy);
}
break;
case 3:
System.out.println(dd+", March ,"+yyyy);
break;
case 4:
System.out.println(dd+", April ,"+yyyy);
break;
case 5:
System.out.println(dd+", May ,"+yyyy);
break;
case 6:
System.out.println(dd+", June ,"+yyyy);
break;
case 7:
System.out.println(dd+", July ,"+yyyy);
break;
case 8:
System.out.println(dd+", August ,"+yyyy);
break;
case 9:
System.out.println(dd+", September ,"+yyyy);
break;
case 10:
System.out.println(dd+", October ,"+yyyy);
break;
case 11:
System.out.println(dd+", November ,"+yyyy);
break;
case 12:
System.out.println(dd+", December ,"+yyyy);
break;
default:
System.out.println(" WRONG INPUT.... Please check and try again....");
}
}
else
{
ch3=mm;
switch(ch3)
{
case 1:
System.out.println(dd+", Janaury ,"+yyyy);
break;
case 2:
System.out.println(dd+", February ,"+yyyy);
break;
case 3:
System.out.println(dd+", March ,"+yyyy);
break;
case 4:
System.out.println(dd+", April ,"+yyyy);
break;
case 5:
System.out.println(dd+", May ,"+yyyy);
break;
case 6:
System.out.println(dd+", June ,"+yyyy);
break;
case 7:
System.out.println(dd+", July ,"+yyyy);
break;
case 8:
System.out.println(dd+", August ,"+yyyy);
break;
case 9:
System.out.println(dd+", September ,"+yyyy);
break;
case 10:
System.out.println(dd+", October ,"+yyyy);
break;
case 11:
System.out.println(dd+", November ,"+yyyy);
break;
case 12:
System.out.println(dd+", December ,"+yyyy);
break;
default:
System.out.println(" WRONG INPUT.... Please check and try again....");
}
}
}
}
