class library
{
int d,f;
public void accept(int day)
{
d=day;
}
public void cal()
{
if(d<=5)
f=d*2;
else if(d>5&&d<15)
f=d*5;
else if(d>15)
f=d*10;
}
public void display()
{
System.out.println("FINE="+f);
}
public void main()
{
library obj=new library() ;
obj.accept(12);
obj.cal();
obj.display();
}
}



