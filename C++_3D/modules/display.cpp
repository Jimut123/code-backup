#include<display.h>
#include<iostream>
Display::Display(int width, int height, const std::string& title)
{
    std::cout<<"Constructor!"<<std::endl;
}
Display::~Display()
{
    std::cout<<"Destructor!"<<std::endl;
}