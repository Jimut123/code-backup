#include<iostream.h>
#include<stdio.h>
#include<string.h>
#include"iostream.h"
class std
{
int roll;
char a[100];
public:
void input()
{
cout<<"input roll and Name"<<endl;
gets(a);
cin>>roll;
}
void display()
{
     cout<<a;
     cout<<roll;
     }
     };
int main()
{
     class std *s;
     s=new std[100];
     int i,n;
     cout<<"Enter n:"<<endl;
     cin>>n;
     for(i=0;i<n;i++)
     (s+i)->input();
     for(i=0;i<n;i++)
     *(s+i)->display();
     return 0;
     }    
