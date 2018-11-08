#include <iostream>
#include <iomanip>
#include <limits>
#include <string>
#include <stdio.h>
using namespace std;

int main() {
    int i = 4;
    double d = 4.0;
    string s = "HackerRank ";
    int i1;
    double d1;
    string s1;
    cout<<"\n Enter your string : "<<endl;
    getline(cin, s1);
    cout<<"\n Enter an integer ::"<<endl;
    cin>>i1;
    cout<<"\n Enter a double ::"<<endl;
    cin>>d1;

    fflush(stdin);


    cout<<s1<<endl;
    i=i+i1;
    d=d+d1;
    //s=s+s2;
    cout<<i<<endl;
    cout<<d<<endl;
    //cout<<s<<endl;
    return 0;
  }
