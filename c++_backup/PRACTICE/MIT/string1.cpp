
#include <iostream>
#include <cctype>

using namespace std;

int main()
{

	char messyString[] = "t6H0I9s6.iS.999a9.STRING";

	char current = messyString[0];
	for(int i = 0; current !='\0';current = messyString[++i])
	{
		if(isalpha(current))
			cout << (char)(isupper(current)?tolower(current):current);
		else if(ispunct(current))
			cout << ' ';
	}
	cout << endl;
	return 0;
}

