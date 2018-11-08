#include<iostream>
using namespace std;
class GradeBook
{
public:
  void displayMessage()
  {
    cout<<"\n Welcome to GradeBook!!\n"<<endl;
  }
};
int main()
{
  GradeBook myGradebook;
  myGradebook.displayMessage();
  return 0;
}
