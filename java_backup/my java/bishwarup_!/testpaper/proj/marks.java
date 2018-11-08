package testpaper.proj;

class marks extends students
{
String sub="";
int r=0,m=0;
void input()
{
super.input();
System.out.println("give the registration number :");
r=ob.nextInt();
System.out.println("give the subject name :");
sub=ob.nextLine();
System.out.println("give the marks :");
m=ob.nextInt();
}
void display()
{
super.display();
System.out.println("registration number : "+r);
System.out.println("subject name : "+sub);
System.out.println("marks : "+m);
}
}
