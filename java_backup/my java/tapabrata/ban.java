import java.io.*;
class ban
{
int rev=0;
int amount,dummy;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void intake()throws IOException
{
System.out.println(" Enter the amount ");
amount=Integer.parseInt(br.readLine());
if(amount>9999)
{System.out.println(" invalid ");
return;
}
dummy=amount;
while(dummy>0)
{
rev=rev*10+dummy%10;
dummy=dummy/10;
}
System.out.println(" amount in words ");
while(rev>0)
{switch(rev%10)
{
case 0:
System.out.println(" zero");
break;
case 1:
System.out.println(" one ");
break;
case 2:
System.out.println("two");
break;
case 3:
System.out.println(" three ");
break;
case 4:
System.out.println(" four");
break;
case 5:
System.out.println(" five");
break;
case 6:
System.out.println(" six ");
break;
case 7:
System.out.println(" seven ");
break;
case 8:
System.out.println(" eight ");
break;
case 9:
System.out.println(" nine ");
break;
}
rev=rev/10;
}
System.out.println("denominations ");
rev=amount/1000;
if(rev!=0)
System.out.println("1000 X " +rev+" = " +rev*1000);
amount=amount%1000;
rev=amount/500;
if(rev!=0)
System.out.println("500 X " +rev+" = " +rev*500);
amount=amount%500;
rev=amount/100;
if(rev!=0)
System.out.println("100 X " +rev+" = " +rev*100);
amount=amount%100;
rev=amount/50;
if(rev!=0)
System.out.println("50 X " +rev+" = " +rev*50);
amount=amount%50;
rev=amount/20;
if(rev!=0)
System.out.println("20 X " +rev+" = " +rev*20);
amount=amount%20;
rev=amount/10;
if(rev!=0)
System.out.println("10 X " +rev+" = " +rev*10);
amount=amount%10;
rev=amount/5;
if(rev!=0)
System.out.println("5 X " +rev+" = " +rev*5);
amount=amount%5;
rev=amount/2;
if(rev!=0)
System.out.println("2 X " +rev+" = " +rev*2);
amount=amount%2;
rev=amount/1;
if(rev!=0)
System.out.println("1 X " +rev+" = " +rev*1);
amount=amount%1;
}
static void main(String args[])throws IOException
{
ban ob=new ban();
ob.intake();
}
}



