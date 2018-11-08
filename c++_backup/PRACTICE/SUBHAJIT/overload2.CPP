/*To write a program to add two complex numbers using binary operator overloading.
ALGORITHM:

Step 1: Start the program.
Step 2: Declare the class.
Step 3: Declare the variables and its member function.
Step 4: Using the function getvalue() to get the two numbers.
Step 5: Define the function operator +() to add two complex numbers.
Step 6: Define the function operator -() to subtract two complex numbers.
Step 7: Define the display function.
Step 8: Declare the class objects obj1,obj2 and result.
Step 9: Call the function getvalue using obj1 and obj2
Step 10: Calculate the value for the object result by calling the function operator + and     operator -.
Step 11: Call the display function using obj1 and obj2 and result.
Step 12: Return the values.
Step 13: Stop the program.
PROGRAM:
*/
#include<iostream.h>
#include<conio.h>
 
class complex
{
              int a,b;
    public:
              void getvalue()
              {
                 cout<<"Enter the value of Complex Numbers a,b:";
                 cin>>a>>b;
              }
              complex operator+(complex ob)
              {
                            complex t;
                            t.a=a+ob.a;
                            t.b=b+ob.b;
                            return(t);
              }
              complex operator-(complex ob)
              {
                            complex t;
                            t.a=a-ob.a;
                            t.b=b-ob.b;
                            return(t);
              }
              void display()
              {
                            cout<<a<<"+"<<b<<"i"<<"\n";
              }
};

void main()
{
   clrscr();
   complex obj1,obj2,result,result1;
 
   obj1.getvalue();
   obj2.getvalue();
 
   result = obj1+obj2;
   result1=obj1-obj2;
 
   cout<<"Input Values:\n";
   obj1.display();
   obj2.display();
  
   cout<<"Result:";
   result.display();
  result1.display();
  
   getch();
}

/*
Output:

Enter the value of Complex Numbers a, b
4                  5
Enter the value of Complex Numbers a, b
2                  2
Input Values
4 + 5i
2 + 2i
Result
6 +   7i
2 +   3i
*/