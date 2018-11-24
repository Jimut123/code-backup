#include <iostream>

using namespace std;

int global_var[3];
int main()
{
    int local_var[3];
    cout << "Global : " <<global_var[0]<<" "<<global_var[1]<<" "<<global_var[2]<<endl;
    cout << "Global : " <<local_var[0]<<" "<<local_var[1]<<" "<<local_var[2]<<endl;
    return 0;
}
