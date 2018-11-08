#include<iostream.h>
#include<conio.h>
const m=50;
class item
{
	int it_code[m];
	char it_name[m];
	float it_cost[m];
	int count;
  public:
	void cou(void){count=0;}	//initializes count to 0
	void getdata(void);
	void dispsum(void);
	void remove(void);
	void dispitems(void);
 };

 void item::getdata(void)
 {
	cout<<"Enter Item code:\n";
	cin>>it_code[count];
	cout<<"Enter Iten Name:\n";
	cin>>it_name[count];
	cout<<"Enter Item Cost:\n";
	cin>>it_cost[count];
	count++;
 }

 void item::dispsum(void)
 {
   float sum=0.0;
   for(int i=0;i<count;i++)
   sum=sum+it_cost[i];
   cout<<"Total Value: "<<sum<<"\n";
 }

 void item::remove(void)
 {
	int a;
	cout<<"Enter item Code: ";
	cin>>a;
	for(int i=0;i<count;i++)
	if(it_code[i]==a)
	it_code[i]=0;
 }
 void item::dispitems(void)
 {
	cout<<"\n ITEM CODE  COST OF ITEM \n";
	 for(int i=0;i<count;i++)
		{
			cout<<"\n"<<it_code[i];
			cout<<"\n"<<it_name[i];
			cout<<" "<<it_cost[i];
		}
		cout<<"\n";
 }

 void main()
 {
	clrscr();
	item order;
	order.cou();
	int x;
	do
	{
		cout<<"Enter appropriate Number\n";
		cout<<"\n 1:Add Item";
		cout<<"\n 2:Display Total Value";
		cout<<"\n 3:Delete item";
		cout<<"\n 4:Display All Items";
		cout<<"\n 5:QUIT";
		cout<<"\n \n What is your OPTION?";
		cin>>x;
		switch(x)
		{
			case 1: order.getdata();
				break;
			case 2: order.dispsum();
				break;
			case 3: order.remove();
				break;
			case 4: order.dispitems();
				break;
			case 5: break;
			default:
				cout<<"\n Error in Input!!\n";
		 }
	    }while(x!=5);
	    getch();
       }





