#include<stdio.h>
#include<dos.h>
#include<conio.h>
#include<stdlib.h>
void main()
{
char s[10];
int i;
clrscr();
printf("Enter text:");
gets(s);

//c=200;
for(i=0;i<strlen(s);i++)
{
if(s[i]=='a')
{
sound(200);
delay(350);
nosound();

}
if(s[i]=='b')
{
sound(300);
delay(350);
nosound();
}
if(s[i]=='c')
{
sound(500);
delay(350);
nosound();
}
//c+=400;
if(s[i]=='d')
{
sound(900);
delay(350);
nosound();
}
//c+=800;
if(s[i]=='e')
{
sound(1700);
delay(350);
nosound();
}
//c+=1600;
if(s[i]=='f')
{
sound(3300);
delay(350);
nosound();
}
//c+=3200;
if(s[i]=='g')
{
sound(6500);
delay(350);
nosound();
}
if(s[i]==' ')
delay(350);
}
getch();
}