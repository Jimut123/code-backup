import java.io.*;
class abc1 
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));int ee=0;
do
{
System.out.println("Press 1 to translate a 3-digits no. into words");
System.out.println("Press 2 to check a 3-digits no. is palindrome or not");
System.out.println("Enter your choice");
int ch=Integer.parseInt(br.readLine());
System.out.println("Enter the no.");
int n=Integer.parseInt(br.readLine());
int x=0;x=n;int y=0;
while(x>0)
{
y++;
x=x/10;
}
if(y>3)
{
System.out.println("The no. is more than a 3-digit no.");
System.exit(0);
}
if(ch==1)
{
String st="";
int s=n%100;
if(s>0&&s<10)
st=word(s*11)+st;
else if(s==10)
st="ten "+st;
else if(s==11)
st="eleven "+st;
else if(s==12)
st="twelve "+st;
else if(s==13)
st="thirteen "+st;
else if(s==14)
st="fourteen "+st;
else if(s==15)
st="fifteen "+st;
else if(s==16)
st="sixteen "+st;
else if(s==17)
st="seventeen "+st;
else if(s==18)
st="eighteen "+st;
else if(s==19)
st="nineteen "+st;
else if(s==20)
st="twenty "+st;
else if(s>20&&s<30)
st="twenty"+word(s)+st;
else if(s==30)
st="thirty "+st;
else if(s>30&&s<40)
st="thirty"+word(s)+st;
else if(s==40)
st="fourty "+st;
else if(s>40&&s<50)
st="fourty"+word(s)+st;
else if(s==50)
st="fifty "+st;
else if(s>50&&s<60)
st="fifty"+word(s)+st;
else if(s==60)
st="sixty "+st;
else if(s>60&&s<70)
st="sixty"+word(s)+st;
else if(s==70)
st="seventy "+st;
else if(s>70&&s<80)
st="seventy"+word(s)+st;
else if(s==80)
st="eighty "+st;
else if(s>80&&s<90)
st="eighty"+word(s)+st;
else if(s==90)
st="ninety "+st;
else if(s>90)
st="ninety"+word(s)+st;
s=n/100;
if(s!=0)
st=word(s)+" hundred and "+st;
System.out.println(st);
}
else if(ch==2)
{
int copy=n,rev=0;
while(n>0)
{
rev=rev*10+n%10;
n=n/10;
}
if(rev==copy)
System.out.println("The no. is palindrome");
else
System.out.println("The no. is not palindrome");
}
else
System.out.println("wrong choice");
System.out.println("to continue press zero else press 1");
ee=Integer.parseInt(br.readLine());
}while(ee==0);
}
static String word(int g)
{
String st="";
int r=g%10;
if(r==1)
st="one"+st;
else if(r==2)
st="two"+st;
else if(r==3)
st="three"+st;
else if(r==4)
st="four"+st;
else if(r==5)
st="five"+st;
else if(r==6)
st="six"+st;
else if(r==7)
st="seven"+st;
else if(r==8)
st="eight"+st;
else if(r==9)
st="nine"+st;
return st;
}
}