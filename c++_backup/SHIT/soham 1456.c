#include"iostream.h"
#include<conio.h>
#include<math.h>
int main()
{
    int a,b,c;
    cin>>a>>b>>c;
    if((a*a)==(b*b)+c^2)
    cout<<"supports pythagorean triplet"<<endl;
    else
    if(b^2==a^2+c^2)
    cout<<"supports pythagorean triplet"<<endl;
    else
    if(c^2==a^2+b^2)
    cout<<"supports pythagorean triplet"<<endl;
    getch();
}
