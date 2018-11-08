#include<stdio.h>
char stack[100];
int count=0;
int main()
{
int n,li_limak,li_bob,i,j,limak=0,bob=0;
scanf("%d",&n);
for(i=0;i<n;i++)
{
limak=0;
bob=0;
scanf("%d",&li_limak);
scanf("%d",&li_bob);
for(j=1;;j++)
{
if(j%2!=0)
limak=limak+j;
else
bob=bob+j;
if(li_limak<limak)
{
stack[count++]='b';
//printf("Bob");
break;
}
if(li_bob<bob)
{
stack[count++]='l';
//printf("Limak");
break;
}
}

}
for(i=0;i<count;i++)
{
if(stack[i]=='b')
printf("Bob\n");
else if(stack[i]=='l')
printf("Limak\n");
}
return 0;
}
