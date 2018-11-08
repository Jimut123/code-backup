class dateofbirth
{public String D_of_week(int k,int m,int year)
{int c,y,w,M=0;
if((m>2&&m<=12))
M=m-2;
else if(m>0 && m<=2)
{M=m+10;
year-=1;
}

StringBuffer day=new StringBuffer();
c=year/100;
y=year%100;
w=(int)((k+(Math.floor(2.6*M-0.2))-2*c+y+(Math.floor(y/4))+(Math.floor(c/4)))%7);
System.out.println(w);
if(w<0)
w+=7;
if(w==0)
day=new StringBuffer("Sunday");
if(w==1)
day=new StringBuffer("Monday");
if(w==2)
new StringBuffer("Tuesday");
if(w==3)
day=new StringBuffer("Wednesday");
if(w==4)
day=new StringBuffer("Thursday");
if(w==5)
day=new StringBuffer("Friday");
if(w==6)
day=new StringBuffer("Saturday");
return day.toString();
}
}

