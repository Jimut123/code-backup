#include<iostream>
#include<cstdlib>
#include<random>
#include<ctime>
int main()
{
    srand(time(NULL));
    std::cout  << (rand() % 10) + 1 << std::endl;
    return 0;
}