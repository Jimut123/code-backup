#include <iostream>
#include <string>
using namespace std;

#include <boost/regex.hpp>

int main ()
{
    boost::regex fullname_regex ("[A–Z]+[a–z]*, [A–Z][a–z]*");

    string name;
    cout << "Enter you full name: " << flush;

    getline (cin, name);
    if (! regex_match (name, fullname_regex))
    {
        cout << "Error: name not entered correctly" << endl;
    }

    return 0;
}
