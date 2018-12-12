#include<stdio.h>
#include<zarvis.h>
void main()
{
int i,l;
char decision='y';

char s[100];
clrscr();
display_scene_1();
while(decision=='y')
{
printf("\nSir how can Zarvis help you ? I mean enter anything in sentence ...\n");
gets(s);
/*for(i=0;s[i]!='\0';i++)
{
if(s[i]==' ')
{
for(j=i+1;s[j]!=' ';j++)
{
i++;
if(s[i]!=)
}
}
}
*/
compare(&s[0]);
printf("\nWant to continue sir ?(y/n)\n");
decision=getche();
}
getch();
}