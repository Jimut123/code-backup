#include<iostream>
using namespace std;
int main() {
    long n = 600851475143;
    long m;
    while (n % 2 == 0) { 
        m = 2; 
        n >>= 1; 
    } 
  
    for (long i = 3; i * i <= n; i += 2) { 
        while (n % i == 0) { 
            m = i; 
            n = n / i; 
        } 
    } 
  
    if (n > 2) 
        m = n; 
    cout << m;
}