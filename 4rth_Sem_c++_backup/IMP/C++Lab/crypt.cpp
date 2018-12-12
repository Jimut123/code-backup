#include <iostream>
#include <cstring>
using namespace std;
class Encrypt
{
	char text[100];
 public:
	Encrypt();
	~Encrypt();
	friend Encrypt operator+(int key, Encrypt E);
//	Encrypt operator-(Encrypt &E, int key);
};
Encrypt :: Encrypt()
{
	cout << "Enter Plain Text: ";
	cin.getline(text, 100);
}
Encrypt :: ~Encrypt()
{
	cout << "Nerdy" << endl;
}
Encrypt operator+(int key, Encrypt E)
{
	Encrypt E1;

	

	int i, k = 0;
	for(i = 0; E.text[i]; i++)
	//	E1.text[k++] = (E.text[i] + key) % 26;
	{

		char ch=E.text[i];

		ch=((int)ch+key);

		E1.text[k++]=ch;

	}
	E1.text[k] = '\0';
	cout << E1.text << endl;
	return E1;
}
int main()
{
	Encrypt E1;
	int k;
	cout << "Enter the key: ";
	cin >> k;
	E1 = k + E1;
	return 0;
}


