#include<stdio.h>
//#include<stdlib.h>
//#include<conio.h>
#define max 5
int c=0;
int a[max][max];   // array initialised by max = 5

int count_digits(int);
int check_digits(int,int);
void coordinates_changer(int,int,int);

void display_dec_box();
void display_matrix();
void display_resultant_matrix();

void main()
{
int c1,c2,choice=1,n,coudig,chkdig;
clrscr();
while(choice!=0)
{

clrscr();
printf("\n Order of sides selection :\n");
display_dec_box();
printf("\n The matrix grid system :\n");
display_matrix();
printf("\n The Matrix :\n");
display_resultant_matrix();

COORDINATES :                                     // goto for co-ordinates
printf("\nEnter the co-ordinates :");
scanf("%d %d",&c1,&c2);
if(c1>4||c2>4)
{
printf("\nEnter co-ordinates less than 4 ..");
goto COORDINATES;
}

coudig=count_digits(a[c1][c2]);
if(coudig>3)
{
printf("\nDigits exceeding limit .. select a different co-ordinates .");
goto COORDINATES;
}
SIDE :                                               // goto for side
printf("\nEnter a number(side) :");
scanf("%d",&n);
chkdig=check_digits(n,a[c1][c2]);
if(chkdig==1)
{
printf("%d exists in %d %d cordinates already, select different side ..",n,c1,c2);
goto SIDE;
}
if(n>4||n<1)
{
printf("\nEnter a side range 1 to 4 .. ");
goto SIDE;
}

a[c1][c2]=a[c1][c2]*10+n;                             // to 1234

coordinates_changer(c1,c2,n);
clrscr();
printf("\n The resultant Matrix :\n");
display_resultant_matrix();


printf("\n Press 1 to continue :");
scanf("%d",&choice);
}
getch();
}

int count_digits(int n)
{
int c=0;
while(n>0)
{
c++;
n=n/10;
}
return c;
}
int check_digits(int n,int ar)
{
int k=ar,d;
while(k>0)
{
d=k%10;
if(n==d)
return 1;                                                  //returns 1 if repetition occurs
k=k/10;
}
return 0;                                                  //returns 0 if repetition donot occurs
}

void coordinates_changer(int c1,int c2,int n)
{
if(c1-1>=0&&c2-1>=0&&c1+1<=max&&c2+1<=max)
{
if(n==1)
a[c1][c2-1]=a[c1][c2-1]*10+3;
if(n==2)
a[c1-1][c2]=a[c1-1][c2]*10+4;
if(n==3)
a[c1][c2+1]=a[c1][c2+1]*10+1;
if(n==4)
a[c1+1][c2]=a[c1+1][c2]*10+2;
}

}



















void display_dec_box()
{
printf("\n");
printf("\t\t\t\t\t   2\n ");
printf("\t\t\t\t\t   -\n ");
printf("\t\t\t\t\t1 | | 3 \n");
printf("\t\t\t\t\t   -\n");
printf("\t\t\t\t\t   4\n ");
printf("\n");
}
void display_matrix()
{
int i,j;
for(i=0;i<max;i++)
{
for(j=0;j<max;j++)
printf("%d %d\t",i,j);
printf("\n");
}
}
void display_resultant_matrix()
{
int i,j;
for(i=0;i<max;i++)
{
for(j=0;j<max;j++)
printf("%d\t",a[i][j]);
printf("\n");
}
}