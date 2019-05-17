#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> g1;
    for(int i=1;i<=5;i++)
        g1.push_back(i);
    cout<<"Output of begin and end : "<<endl;

    for(auto i=g1.begin();i!=g1.end();++i)
        cout<<*i<<"\n";
    
    for(auto i=g1.cbegin();i!=g1.cend();++i)
    cout<<*i<<"\n";

    for(auto ir=g1.rbegin();ir!=g1.rend();++ir)
    cout<<*ir<<"\n";

    for(auto ir=g1.crbegin();ir!=g1.crend();++ir)
    cout<<*ir<<"\n";


    cout<<"Size => "<<g1.size()<<endl;
    //cout << "Hello world!" << endl;
    return 0;
}
