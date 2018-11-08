import java.io.*;
class bill
{
double amt,u;
public void input(int unit)
{
u=unit;
}
public void cal()
{
if(u<=75)
amt=0;
else if(u>75&&u<=150)
amt=0+(u-75)*.50;
else
 if(u>150 && u<=225)
amt=0+(75*.50)+(u-150)*1.00;
else if(u>255&&u<=300)
amt=0+(75*.50)+(75*1.00)+(u-225)*1.50;
else if(u>300)
amt=0+(75*.50)+(75*1.00)+(75*1.50)+(u-300)*2.50;
}
public void display()
{
System.out.println("AMOUNT="+amt);
}
public void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int un;
System.out.println("Enter unit:");
un=Integer.parseInt(br.readLine());
bill obj=new bill();
obj.input(un);
obj.cal();
obj.display();
}
}

