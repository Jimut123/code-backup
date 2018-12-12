#include<iostream>
#include<string>
using namespace std;
class GradeBook
{
public:
  GradeBook(string name)
  {
    setCourseName(name);
  }
  void setCourseName(string name)
  {
    courseName=name;                              //stores the name in the object
  }
  string getCourseName()
  {
    return courseName;
  }
  void displayMessage()
  {
    cout <<"Welcome to the grade book for \n"<< getCourseName()<<"!"<<endl;
  }
private:
  string courseName;
};



int main()
{
  GradeBook gradeBook1("CS101 Introduction to C++ Programming");
  GradeBook gradeBook2("CS102 Data Structures in C++ ");
  cout<<"gradeBook1 created for course :"<<gradeBook1.getCourseName()
      <<"\ngradeBook2 created for course :"<<gradeBook2.getCourseName()<<endl;
}
