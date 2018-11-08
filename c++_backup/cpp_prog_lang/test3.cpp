#include<iostream>
#include<vector>
#include<cstdlib>
#include<string>
std::istream_iterator<string>ii(cin);
std::ostream_iterator<string>oo(cout);
int main()
{
    std::string s1 = *ii;
    ++ii;
    std::string s2 = *ii;
    std::cout<<s1<<' '<<s2<<"\n";
}