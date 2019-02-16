#include <iostream>
#include <cmath>
#include <vector>

using namespace std;

unsigned long findSieveSize(unsigned long n)
{
    if (n < 6)
        return 13;

    if (n >= (~0UL / log(~0UL)))
        return 0;

    unsigned long low  = n;
    unsigned long high = ~0UL - 1;
    do {
        unsigned long mid   = low + (high - low) / 2;
        double guess = mid / log(mid);

        if (guess > n)
            high = (unsigned long) mid - 1;
        else
            low = (unsigned long) mid + 1;
    } while (low < high);
    return high + 1;
}

unsigned long find_nth_prime(unsigned long n)
{
    if (!n) return 1;         
    if (!--n) return 2;        

    unsigned long sieveSize = findSieveSize(n);
    unsigned long count = 0;
    unsigned long max_i = sqrt(sieveSize-1)+1;

    if (sieveSize == 0)
        return 0;

    std::vector<bool> sieve(sieveSize);
    for (unsigned long i = 3;  true;  i += 2) {
        if (!sieve[i]) {
            if (++count == n)
                return i;
            if (i >= max_i)
                continue;
            unsigned long j = i*i;
            unsigned long inc = i+i;
            unsigned long maxj = sieveSize - inc;
            do {
                sieve[j] = true;
                if (j >= maxj)
                    break;
                j += inc;
            } while (1);
        }
    }
    return 0;
}

int main() {
   cout << find_nth_prime(11001);
   return 0;
}