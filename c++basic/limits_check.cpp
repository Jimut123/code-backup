#include <limits>
#include <iostream>
 
int main() 
{
    std::cout << "type\tlowest()\tmin()\t\tmax()\n\n";
 
    std::cout << "uchar\t"
              << +std::numeric_limits<unsigned char>::lowest() << '\t' << '\t'
              << +std::numeric_limits<unsigned char>::min() << '\t' << '\t'
              << +std::numeric_limits<unsigned char>::max() << '\n';
    std::cout << "int\t"
              << std::numeric_limits<int>::lowest() << '\t'
              << std::numeric_limits<int>::min() << '\t'
              << std::numeric_limits<int>::max() << '\n';
    std::cout << "float\t"
              << std::numeric_limits<float>::lowest() << '\t'
              << std::numeric_limits<float>::min() << '\t'
              << std::numeric_limits<float>::max() << '\n';
    std::cout << "double\t"
              << std::numeric_limits<double>::lowest() << '\t'
              << std::numeric_limits<double>::min() << '\t'
              << std::numeric_limits<double>::max() << '\n';
}
