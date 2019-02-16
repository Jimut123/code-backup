#include<iostream>
using namespace std;

int main() {
    long arr[50] = {[0] = 1, [1] = 2};
    for(int i = 2; i < 50; ++i) {
        arr[i] = arr[i - 1] + arr[i - 2];
    }


    long s = 0;
    for(int i = 1;  i < 50; i += 3) {
        if(arr[i] > 40000000) break;
        s += arr[i];

    } 
    cout << s;
}