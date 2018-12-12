#include<iostream.h>
class emp
{
public:
	struct emp1
	{
		int x;
		struct emp1 *next;
	};
	typedef emp1 e;
	struct emp1 *head;
	head =new struct emp1;
	void create()
	{
		char ch='y';
		e *head1;
		head1=head;
		while(ch=='y'|| ch=='Y')
		{
			cout<<"enter date" <<endl;
cin>>head1 -> x;
cout<<"enter another "<<endl;
cin>>ch;
if(ch=='y' || ch=='Y')
{
	head1 -> next=new e;
	head1=head1 ->next;
}
		}
		head1 ->next=NULL;
	}
	void disp()
	{
		e *head1;
		head1=head;
		while(head1)
		{
			cout<<head1 ->x;
			head1=head1 ->next;
		}
	}
};
void main()
{
emp e1;
e1.create();
e1.disp();
}
