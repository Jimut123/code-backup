/******          Designed by Jimut Bahan Pal        **********************
***********      started on 17/3/2017        *****************************
***********      created on 18/3/2017         ****************************
***********     total time spent on creation = 2 hrs    ******************
**************************************************************************/

// In case of difficulties the player enters '+' and the computer gives 'O'
					   //plus                // caps o


#include<stdio.h>
#include<time.h>
#include<stdlib.h>
char a[3][3];
int i,j,cX,cY;
int count=0;
void display(); // to display the matrix one after another
void instructions();// to display the instructions
void delay();// to delay
 //Some functions regarding the checking operations
int check_1(char);
int check_2(char);
int check_d1(char);
int check_d2(char);
void pv();
void cv();

void select_comp();  // to make the computer select its turn
int select_dest(int,int);//to make the computer give the value accordingly
void show_example();
void main()
{
int sw1,sw2;
int k=0;
char c1='+',c2='O';
clrscr();
for(sw1=0;sw1<3;sw1++)
for(sw2=0;sw2<3;sw2++)
a[sw1][sw2]='\0';
while(count<9)
{
k=0;
show_example();
printf("\nEnter the co-ordinates in which u want to put :");
scanf("%d %d",&cX,&cY);
if(a[cX][cY]!='\0')
{
while(k==0)
{
display();
show_example();
printf("\nEnter different co-ordinates in which\n u want to put,it's already filled :");
scanf("%d %d",&cX,&cY);
if(a[cX][cY]=='\0')
{
k=1;
a[cX][cY]='+';
}
else
k=0;
}
}
a[cX][cY]='+';
clrscr();
display();
show_example();
delay();
clrscr();
select_comp();
display();
printf("\n\n\n");
if(check_1(c1)==1)
{
pv();
getch();
exit(3);
}
if(check_1(c2)==1)
{
cv();
getch();
exit(3);
}
if(check_2(c1)==1)
{
pv();
getch();
exit(3);
}
if(check_2(c2)==1)
{
cv();
getch();
exit(3);
}
if(check_d1(c1)==1)
{
pv();
getch();
exit(3);
}
if(check_d1(c2)==1)
{
cv();
getch();
exit(3);
}
if(check_d2(c1)==1)
{
pv();
getch();
exit(3);
}
if(check_d2(c2)==1)
{
cv();
getch();
exit(3);
}
count++;
if(count ==8)
exit(4);
}
getch();
}
void pv()
{
printf("Player wins!!!");
}
void cv()
{
printf("Computer wins!!!");
}
void display()
{
int d1,d2;
for(d1=0;d1<3;d1++)
{
for(d2=0;d2<3;d2++)
printf("%c\t",a[d1][d2]);
printf("\n");
}
}
void instructions()
{
printf("You have to select '+' only...");
printf("You have to enter the coordinates in X Y format.. starting from 0 0.");
}
void delay()
{
int del1,del2;
for(del1=0;del1<10000;del1++)
for(del2=0;del2<10000;del2++);
}
void select_comp()
{
int n,p=0,v=1,h=0;  //h made 0 so that first condition may be false
if(count ==8)
exit(4);
while(p!=1)
{
n=random(9);
v=select_dest(n,h);
if(v==1)
{
h=1;
v=select_dest(n,h);
p=1;
}
}

}
int select_dest(int n,int h)
{
int d1,d2;//destination co-ordinates
if(n==0)
{
d1=0;
d2=0;
}
if(n==1)
{
d1=0;
d2=1;
}
if(n==2)
{
d1=0;
d2=2;
}
if(n==3)
{
d1=1;
d2=0;
}
if(n==4)
{
d1=1;
d2=1;
}
if(n==5)
{
d1=1;
d2=2;
}
if(n==6)
{
d1=2;
d2=0;
}
if(n==7)
{
d1=2;
d2=1;
}
if(n==8)
{
d1=2;
d2=2;
}
if(h==1)
a[d1][d2]='O';
if(a[d1][d2]=='\0')
return 1;
else
return 0;
}
void show_example()
{
int e1,e2;
printf("\n\n\n");
for(e1=0;e1<3;e1++)
{
for(e2=0;e2<3;e2++)
{
printf("%d %d\t",e1,e2);
}
printf("\n");
}
}
int check_1(char ch)             //checking the first,2nd and 3rd row
{
int c_loop;
for(c_loop=0;c_loop<3;c_loop++)
{
if(a[c_loop][0]==ch&&a[c_loop][1]==ch&&a[c_loop][2]==ch)
return 1;
}
return 0;
}
int check_2(char ch)
{
int c_loop;
for(c_loop=0;c_loop<3;c_loop++)
{
if(a[0][c_loop]==ch&&a[1][c_loop]==ch&&a[2][c_loop]==ch)
return 1;
}
return 0;
}
int check_d1(char ch)
{
if(a[0][0]==ch&&a[1][1]==ch&&a[2][2]==ch)
return 1;
return 0;
}
int check_d2(char ch)
{
if(a[0][2]==ch&&a[1][1]==ch&&a[2][0]==ch)
return 1;
return 0;
}


