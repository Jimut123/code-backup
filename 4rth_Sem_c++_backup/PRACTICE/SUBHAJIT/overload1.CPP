/*
Exception to Operator Overloading

Though most of the operators can be overloaded,
there are certain operators that can not be overloaded.
Here is the list of those operators :

dot (.) operator
sizeof operator
Scope resolution (::) operator
Arithmetic if (?:) operator
(.*) operator

*/


/*To write a program to find the complex numbers using unary operator overloading.
ALGORITHM:

Step 1: Start the program.
Step 2: Declare the class.
Step 3: Declare the variables and its member function.
Step 4: Using the function getvalue() to get the two numbers.
Step 5: Define the function operator ++ to increment the values
Step 6: Define the function operator -- to decrement the values.
Step 7: Define the display function.
Step 8: Declare the class object.
Step 9: Call the function getvalue
Step 10: Call the function operator ++() by incrementing the class object and call the   function display.
Step 11: Call the function operator --() by decrementing the class object and call the function display.
Step 12: Stop the program.
PROGRAM:
*/

#include<iostream.h>
#include<conio.h>

class complex
{
     int a,b,c;
    public:
	complex(){}
	void getvalue()
       {
		 cout<<"Enter the Two Numbers:";
		 cin>>a>>b;
       }



  void operator++()
      {
		 a=++a;
		 b=++b;
       }

       void operator--()
       {
		 a=--a;
		 b=--b;
	}

	void display()
	{
		 cout<<a<<"+\t"<<b<<"i"<<endl;
	 }
};

void main()
{
     clrscr();
     complex obj;
     obj.getvalue();
     obj++;
     cout<<"Increment Complex Number\n";
     obj.display();
     obj--;
     cout<<"Decrement Complex Number\n";
     obj.display();
     getch();
}

/*
Output:

Enter the two numbers: 3 6
Increment Complex Number
4 +               7i
Decrement Complex Number
3 +               6i
*/
