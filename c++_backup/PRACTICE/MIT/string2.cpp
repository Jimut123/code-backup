#include <iostream>
#include <cstring>
using namespace std;

int main()
{

	char frag1[] = "I'm a s";
	char frag2[] = "tring!";
	char frag3[20];
	char finStr[20] = "";

	strcpy(frag3,frag1);   			// copies "I'm a s" to frag3
	strcat(finStr,frag3);			// concatenates "I'm a s" to finStr
	strcat(finStr,frag2);			// concatenates "tring!" to finStr after it ...

	cout<< finStr<<endl;			// results in "I'am a string!"

	return 0;
}
