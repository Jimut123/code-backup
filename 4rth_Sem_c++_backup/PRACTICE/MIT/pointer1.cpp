#include <iostream>
using namespace std;
int main()
{

	int x = 10;
	cout << "\nx = "<<x<<endl;        // the value of x simply
	//cout << "*x = "<<*x<<endl;
	cout << "&x = "<<&x<<endl;
	int *ptr1 = &x;
	cout << "*ptr1 = "<<*ptr1<<endl;
	cout << "&ptr1 = "<<&ptr1<<endl;
	cout << "ptr1 = "<<ptr1<<endl;
	
	/* Sample Output ::
	 * x = 10
	 * &x = 0xbfa14ff4
	 * *ptr1 = 10
	 * &ptr1 = 0xbfa14ff8
	 *
	 * */
	
		
	// Now manipulating the values of x with the pointer
	
	*ptr1 = 5;
	cout << "\nx = "<<x<<endl;        // the value of x simply
	//cout << "*x = "<<*x<<endl;
	cout << "&x = "<<&x<<endl;
		
	cout << "*ptr1 = "<<*ptr1<<endl;
	cout << "&ptr1 = "<<&ptr1<<endl;
	cout << "ptr1 = "<<ptr1<<endl;

	
	return 0;
}

