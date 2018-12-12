#include<stdio.h>
char a[35]={"WELCOME TO THE FUTURE "};
char b[35]={"Starting up ZARVIS ...."};
char d[5]={"..."};
int p=0,v=1;
void delay()
{
int i,j;
for(i=0;i<10000;i++)
for(j=0;j<7500;j++);
}
void small_delay()
{
int i,j;
for(i=0;i<1000;i++)
for(j=0;j<7500;j++);
}
void delaysec()
{
int i,j;
for(i=0;i<15000;i++)
for(j=0;j<20000;j++);
}
int compare(char *c)
{
	int x=0;
	if(*(c+x)!=' ')
	{

		printf("%c",*(c+x));
		x++;
	}
	else
	return 0;
	return 0;
}
void display_scene_1()
{
int l,i,p=0,v=1;
for(l=1;l<=3;l++)
{
for(i=0;a[i]!='\0';i++)
{
p++;
printf("%c",a[i]);
if(v==1)
{
delay();
}
}
v=0;
if(p>=22)
{
for(i=0;d[i]!='\0';i++)
{
printf("%c",d[i]);
delaysec();
}
clrscr();
}
}
for(i=0;b[i]!='\0';i++)
{
printf("%c",b[i]);
delay();
}
clrscr();
}
