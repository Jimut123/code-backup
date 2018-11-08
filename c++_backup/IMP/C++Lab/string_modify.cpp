#include <iostream>
#include <cstring>
using namespace std;
class StringComp
{
	char s[100];
 public: 
	StringComp();
	~StringComp();
	bool operator!=(StringComp);
};
StringComp :: StringComp()
{
	cout << "Enter a String: ";
	cin.getline(s, 100);
}
StringComp :: ~StringComp()
{
	//cout << "Space Free!\n";
}
bool StringComp :: operator!=(StringComp sc)
{
	int i, j, n1, n2;
	n1 = strlen(s);
	n2 = strlen(sc.s);
	if(n1 != n2)
		return true;
	for(i = 0, j = 0; i < n1, j < n2; i++, j++)
	{
		if(s[i] != sc.s[j])
			continue;
		else
			break;
	}
	return true;
}
int main()
{
	StringComp SC1, SC2;
	if(SC1 != SC2)
		cout << "Unequal\n";
	else
		cout << "Equal\n";
	return 0;
}	
