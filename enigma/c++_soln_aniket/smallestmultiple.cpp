#include<iostream>
#include<algorithm>
#include<vector>
#include<numeric>
using namespace std;
using ull = unsigned long long;

ull lcm(ull a, ull b) {
    ull temp = __gcd(a, b);
    ull lcm = temp ? (a / temp * b) : 0;
    return lcm;
}


int main() {
    vector<ull> vec(30);
    iota(vec.begin(), vec.end(), 1);
    ull res = accumulate(vec.begin(), vec.end(),ull(1), lcm);
    cout << res;
}
