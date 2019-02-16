#include<iostream>
using namespace std;
int main() {
    long s = 0;
    for(long i = 1; i < 70000000; ++i) {
        if(i % 3 == 0 || i % 5 == 0) s+= i;
    }
    cout << s;
}