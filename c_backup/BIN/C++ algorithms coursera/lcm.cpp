#include <iostream>

long long lcm_naive(int a, int b) {
  for (long l = 1; l <= (long long) a * b; ++l)
    if (l % a == 0 && l % b == 0)
      return l;

  return (long long) a * b;
}
int gcd_fast(long long a, long long b) {
	if(b==0)
	return a;
	else return gcd_fast(b,a%b);
  
}
int main() {
  long long a, b,c,d;
  std::cin >> a >> b;
  c=a;d=b;    
  long long k=(long long)gcd_fast(a, b);
  long long lcm=c*d/k; 
  std::cout << lcm << std::endl;
  return 0;
}
