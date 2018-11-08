//stores all details of Student node
import java.util.*;
class StudentN
{
private int rollNo;//instance variables
private String name;
private double average;
private StudentN link;

public StudentN()//default constructor
{
rollNo=1;
name="";
average=0.0;
link=null;
}

public StudentN(int rno, String nm, double avg,StudentN l)//parameterized
{
rollNo=rno;
name=nm;
average=avg;
link=l;
}

public void setLink(StudentN l)
{
link=l;
}

public StudentN getLink()
{
return link;
}

public int getRoll()
{
return rollNo;
}

public void setRoll(int r)
{
rollNo=r;
}

public String getName()
{
return name;
}

public void setName(String nm)
{
name=nm;
}

public double getAvg()
{
return average;
}

public void setAvg(double a)
{
average=a;
}
}
	

//sorting a student linked list based on average marks
//
class StudentSort
{
private int n;
private StudentN start;

public void get()
{
Scanner sc=new Scanner(System.in);//for input
System.out.println("Enter the no. of nodes:");
n=sc.nextInt();
String name;int roll;double avg;
for(int i=1;i<=n;i++)
{
System.out.println("\nEnter the roll no, name and average marks of student:");
roll=sc.nextInt();
name=sc.next();
avg=sc.nextDouble();
StudentN temp=new StudentN(roll,name,avg,null);//calling the parameterized constructor
if(start==null)
start=temp;
else
{
StudentN t=start;
while(t.getLink()!=null)//traversing to last node
t=t.getLink();
t.setLink(temp);
}
}
}

public void display()//displaying the linked list
{
System.out.println("Name Roll No Average");
System.out.println("--------------------------------------");
StudentN t=start;
while(t!=null)
{
System.out.print(t.getName()+printSpace(19-t.getName().length()));
System.out.print(t.getRoll()+printSpace(12-String.valueOf(t.getRoll()).length()));
System.out.print(t.getAvg()+printSpace(7-String.valueOf(t.getAvg()).length()));
System.out.println();
t=t.getLink(); 
} 
System.out.println("______________________________________");
}

public String printSpace(int sp)//to print 'sp' no. of spaces
{
String str="";
for(int i=1;i<=sp;i++)
{
str=str+" ";
}
return str;
}

public void sort()//sorting is done here
{
StudentN temp=null;//temporary node created for the purpose of swapping
int i=1;
while(i<n)
{
StudentN ptr=start;//stores initial node address
for(int j=0;j<n-1;ptr=ptr.getLink())
{
if(ptr.getAvg()<ptr.getLink().getAvg())//comparing 2 consecutive nodes
{
//swapping the values
double tavg=ptr.getAvg();
int troll=ptr.getRoll();
String tname=ptr.getName();

ptr.setAvg(ptr.getLink().getAvg());
ptr.setRoll(ptr.getLink().getRoll());
ptr.setName(ptr.getLink().getName());

ptr.getLink().setAvg(tavg);
ptr.getLink().setRoll(troll);
ptr.getLink().setName(tname);
}
j++;
}
i++;
}
}
}//end of class StudentSort

public class StudentSortM
{
public static void main(String args[])
{
StudentSort obj=new StudentSort();//object creation
obj.get();
obj.display();
obj.sort();
System.out.println("Students in descending order of average marks-->");
obj.display();
}
}