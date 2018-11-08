package testpaper.proj;

import java.util.Scanner;
class students
{
Scanner ob=new Scanner(System.in);
String n="",s="";
int cl=0;
void input()
{
System.out.println("give the name :");
n=ob.nextLine();
System.out.println("give the section :");
s=ob.nextLine();
System.out.println("give the class :");
cl=ob.nextInt();
}
void display()
{
System.out.println("name : "+n);
System.out.println("class : "+cl);
System.out.println("section : "+s);
}
}
