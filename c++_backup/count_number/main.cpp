#include <iostream>
#include <bits/stdc++.h>

using namespace std;

ifstream f("data.in");
ofstream g("data.out");

int A[100],n,i;
int main()
{
    f>>n;
    for(i=1;i<=n;i++){
        int x;
        f>>x;
        ++A[x];
    }
    if (A[5]>0) g<<"YES, it appears!"<<endl;
    else    g<<"NO, it doesn't appear!"<<endl;
    return 0;
}
