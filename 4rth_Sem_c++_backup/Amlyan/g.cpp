#include<iostream>
#include<gmp.h>
#include<gmpxx.h>
using namespace std;
// g++ -o g g.cpp -lgmp -lgmpxx (to compile) 
int main()
{
	mpz_t a,b;
	mpz_init(a);
	mpz_init(b);
	mpz_set_ui(b,2);
	mpz_pow_ui(a,b,1000000);
	gmp_printf("%Zd\n",a);
	return 0;
}



