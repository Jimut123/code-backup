/*  C++ Program to return absolute value of variable types integer and float using function overloading       */

#include <iostream.h>
int absolute(int);
float absolute(float);
void main() 
{
    int a = -5;
    float b = 5.5;
    
    cout<<"Absolute value of "<<a<<" = "<<absolute(a)<<endl;
    cout<<"Absolute value of "<<b<<" = "<<absolute(b);

}

int absolute(int var) {
     if (var < 0)
         var = -var;
    return var;
}

float absolute(float var){
    if (var < 0.0)
        var = -var;
    return var;
}