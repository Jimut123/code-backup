/*
 * This program is designed by Jimut Bahan pal
 */

//
#include<iostream>
#include<curses.h>
using namespace std;

//initscr();

char a[30][30];
void print_and_clear(
		int,int  = 0 // this will be 0 then it will not be used
	   	);

int pos_i=10,pos_j=10;


void change_player_pos(int size,			// size
		        char choice			//choice ''A''W''S''D'
		);

class Board
{
	public:
		void print_and_clear(int size,int clear)
		{
			int i,j;
			for(i=0;i<size;i++)
			{
				for(j=0;j<size;j++)
				{
					if(clear == 1&& i!=0 && i!=size-1 && j!=0 && j!=size-1)
					{
						a[i][j]=' ';
					}
					if(i!=0 && i!=size-1 && j!=0 && j!=size-1)
						cout << a[i][j]<<' ';
					if(j==0||j==size-1)
						cout<<"|";
					if(i==0||i==size-1)
						cout<<"_";

				}
				if(clear!=1)
					cout<<endl;
			}
		}
		/*void print_()
		{
			int i;
			for(i=0;i<=10;i++)
				cout<<"---";
		}*/	
		void change_player_pos(int size,			// size
				       char choice			//choice ''A''W''S''D'
				       )
		{
		//clearing
	        //	print_and_clear(size,1);
		if(pos_i>0 &&  pos_j >0 && pos_i <size-1 && pos_j<size-1)
		{
			print_and_clear(size,1);		
			if(choice=='a' || choice=='A')
				a[pos_i][--pos_j]='J';
			
			if(choice=='w' || choice=='W')
				a[--pos_i][pos_j]='J';
		
			if(choice=='d' || choice=='D')
			        a[pos_i][++pos_j]='J';
		
			if(choice=='s' || choice=='S')
				 a[++pos_i][pos_j]='J';
		}

		}	

};

int main()
{
	//char a[10][10];
	a[5][5] = 'J';
	int size = 30;              // size of the board
	//initscr();
	Board b_obj;			// object of the Board Class
	int i,j;
	b_obj.print_and_clear(size,
				1        //cleared
			     );
	int pos_i = 10,				 //initial position of i
	    pos_j = 10; 				// initial position of j

	a[pos_i][pos_j]='J';			// initial position of the player
	

	b_obj.print_and_clear(size,
				0		//to print the array
			     );
	char choice='0';
	
	while(choice!='q' && choice!='Q' )
	{
		//	b_obj.print_();
		cout<<"\n press q to quit!"<<endl;
		//nodelay(stdscr, TRUE);
		cin>>choice;
		if((choice == 'W' || choice == 'w')	//move forward
		   ||(choice == 'A' || choice == 'a')	//move left	
		   ||(choice == 'D' || choice == 'd')	//move right
	           ||(choice == 'S' || choice == 's'))	//move back
		 {
			 cout<<"You pressed :"<<choice<<endl;
			 b_obj.change_player_pos(size, 		//SIZE
						 choice		//awsd
						);
			 cout<<endl;
			 b_obj.print_and_clear(size,0);
			 cout<<endl;
		 }
		//b_obj.print_();
	}	

	return 0;

}
