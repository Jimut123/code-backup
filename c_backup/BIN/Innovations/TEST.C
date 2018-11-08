#include <time.h>
#include <stdlib.h>
#define max_size 20              // max size can be altered

int score=0;
int M=0;
int ref;
int fc1,fc2;
char a[max_size][max_size];
int x=3,y=3;
int ran(int);
void sound_generate(int);
void array_refresh(char a[max_size][max_size],int);
int array_input(char a[max_size][max_size]);
void array_print(char a[max_size][max_size],int);
void delay();
void array_generate_food(char a[max_size][max_size]);
int scr=0;

int main(){
int k=1;					 //x and y are initial positions
srand(time(NULL));   // should only be called once
a[x][y]='J';
while(1)
{
ref=array_input(a);
array_refresh(a,max_size);
array_print(a,max_size);
if(x==max_size-1||y==max_size-1||x==0||y==0)
{
printf("You Loose!!");
sound_generate(400);
delay(500);
exit(5);
}
printf("\nYour co-ordinates : %d %d\n",x,y);
printf("food co-ordinates : %d %d\n",fc1,fc2);
printf("Limiting co-ordinates : x = %d y = %d\n",0,max_size);
printf("Score = %d\n",score);
if(scr==0||score-scr==1){
array_generate_food(a);
if(k==0)
scr++;
k=0;
}
}
//return 0;
}
void sound_generate(int n)
{
sound(n);
delay(500);
nosound();
}
int ran(int n){
int i;
int r = rand()%n;      // returns a pseudo-random integer between 0 and RAND_MAX
return r;
}
void delay()
{
int i,j;
for(i=0;i<1000;i++)
for(j=0;j<1000;j++);
}
void array_refresh(char a[max_size][max_size],int n)            // array and the array size
{
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]='\0';
if(i==x&&j==y)
{
a[i][j]='J';
}
if(i==fc1&&j==fc2)
{
a[i][j]='*';
}
if(i==fc1&&j==fc2&&i==x&&j==y)
{
//a[i][j]='J';
a[fc1][fc2]='\0';
array_generate_food(a);
sound_generate(700);
score++;
}
}
}
}
int array_input(char a[max_size][max_size])// x and y are initial position
{
char ch;
if(M==0)
{
printf("\n\'W\' to move forward,\'A\' to move left,\'D\' to move right,\'S\' to move backwards  \'E\' to exit:\n\n\n\n\n\n\n");
M=1;
}
printf("");
//scanf("%c",&ch);
ch=getch();
printf("\n\n\n\n");
if(ch=='E'||ch=='e')
{
exit(4);
}
if((y+1)<max_size && (y-1)>0 && (x+1)<max_size && (x-1)>0)
{
//printf("(y+1)<max_size && (y-1)>=0 && (x+1)<max_size && (x-1)>=0");
if(ch=='D'||ch=='d')
{
a[x][y++]='J';
}
if(ch=='W'||ch=='w')
{
a[x--][y]='J';
}
if(ch=='S'||ch=='s')
{
a[x++][y]='J';
}
if(ch=='A'||ch=='a')
{
a[x][y--]='J';
}
return 1;
}
return 0;
}
void array_print(char a[max_size][max_size],int n){
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
printf("%c ",a[i][j]);
printf("\n");
}
}
void array_generate_food(char a[max_size][max_size])//n=max_size
{
int fc=max_size;
fc1=ran(fc-1);
fc2=ran(fc-1);
if(fc1==0)
fc1+=2;
if(fc2==0)
fc2+=2;
if(fc1>=max_size)
fc1-=2;
if(fc2>=max_size)
fc2-=2;

a[fc1][fc2]='*';
sound_generate(500);
}










