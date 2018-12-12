#include <cstdlib>
#include <iostream>
#include <climits>
#include <vector>
#include <list>

void primitive_calculator(int32_t number)
{
    std::list<int32_t>* path = new std::list<int32_t>[number+1];

    path[1].push_back(1);

    for (int i = 2; i <= number; i++)
    {
        std::size_t previous = i - 1;

        if ((i%3 == 0) && (path[i/3].size() < path[previous].size()))
        {
            previous = i/3;
        }

        if ((i%2 == 0) && (path[i/2].size() < path[previous].size()))
        {
            previous = i/2;
        }

        path[i] = path[previous];
        path[i].push_back(i);
    }

    std::cout << path[number].size() - 1 << '\n';
    while (!path[number].empty())
    {
        std::cout << path[number].front() << ' ';
        path[number].pop_front();
    }
}
void main()
{
int32_t number = 96234;
const clock_t begin_time = clock();
primitive_calculator(number);
const clock_t end_time = clock();
std::cout << "\ntime: " << float( end_time - begin_time ) /  CLOCKS_PER_SEC << "\n";
}
