#include<iostream>
#include<string>
using namespace std;
class GradeBook
{
public:
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
  string nameOfCourse;
  GradeBook myGradeBook;
  cout << "Initial course name is :"<<myGradeBook.getCourseName()<<endl;
  cout <<"\n Please enter the course name :"<<endl;
  getline(cin,nameOfCourse);
  myGradeBook.setCourseName(nameOfCourse);
  cout<<endl;
  myGradeBook.displayMessage();
}
