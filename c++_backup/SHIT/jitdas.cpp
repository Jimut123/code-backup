#include<iostream.h>
#include<conio.h>
int main()
{
     
     int a,b,c;
     cin>>a;
     cin>>b;
     cin>>c;
     if((a*a)==((b*b)+(c*c)))
     cout<<"supports pythagorean triplet"<<endl;
     else
     if((b*b)==((a*a)+(c*c)))
     cout<<"supports pythagorean triplet"<<endl;
     else
     if((c*c)==((a*a)+(b*b)))
     cout<<"supports pythagorean triplet"<<endl;
     else
     cout<<"does not support pythagorean triplet"<<endl;
     getch();
     return 0;
}
