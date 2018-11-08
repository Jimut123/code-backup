#include<iostream>
#include "GradeBook.h"
using namespace std;
int main()
{
  GradeBook gradeBook1("CS101 Introduction to C++ Programming");
  GradeBook gradeBook2("CS102 Data Structures in C++ ");
  cout<<"gradeBook1 created for course :"<<gradeBook1.getCourseName()
      <<"\n gradeBook2 created for course :"<<gradeBook2.getCourseName()<<endl;
}
