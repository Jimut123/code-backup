#include<iostream.h>
#include<stdio.h>

class shape
{public:
 double x;
 double y;
 //public:
 void get_data()
 {cout<<"enter x:"<<endl;
  cin>>x;
  cout<<"enter y:"<<endl;
  cin>>y;
 }
 virtual void display_area()
  {}
};

class triangle : public shape
{
 public:
 double area1;
 //public:
 void display_area()
 { area1=.5*x*y;
   cout<<"triangle area="<<area1<<endl;
 }
};

class rectangle : public shape
{public:
 double area2;
 //public:
 void display_area()
 {area2=x*y;
  cout<<"rectangle area="<<area2<<endl;
 }
};

class circle : public shape
{public:
 double area3;
 //public:
 void display_area()
 {area3=(22/7)*x*x;
  cout<<"circle area="<<area3<<endl;
 }
};

int main()
{
 shape *sptr[3];
 shape s;
 s.get_data();
 triangle t;
 rectangle r;
 circle c;
 sptr[0]=&t;
 sptr[1]=&r;
 sptr[2]=&c;
 sptr[0]->display_area();
 cout<<endl;
 sptr[1]->display_area();
 cout<<endl;
 sptr[2]->display_area();
 //cout<<endl;
 return 0;
}




