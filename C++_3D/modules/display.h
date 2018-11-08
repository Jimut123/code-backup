#ifndef DISPLAY.H
#define DISPLAY.H

#include<string>
class Display
{
    public:
        Display(int width, int height, const std::string& title);
        virtual ~Display();
    protected:
    private:
        Display(const Display& other){}
        Display& operator=(const Display& other){}
};
