#include<stdio.h>
#include<string.h>
void main()
{
char a[100][100],c[10000],vow[10000],con[10000];
int i,count=0,j,n,vow1=0,con1=0,a1=0,b1=0;
clrscr();
for(i=0;i<=100;i++)
for(j=0;j<=100;j++)
a[i][j]='\0';
printf("Enter the no. of Strings :");
scanf("%d",&n);
for(i=0;i<=n;i++)
{
gets(a[i]);
for(j=0;j<strlen(a[i]);j++)
{
c[count++]=a[i][j];
if(a[i][j]=='.'||a[i][j]==' ');
else if(a[i][j]=='A'||a[i][j]=='E'||a[i][j]=='I'||a[i][j]=='O'||a[i][j]=='U'||
   a[i][j]=='a'||a[i][j]=='e'||a[i][j]=='i'||a[i][j]=='o'||a[i][j]=='u')
vow[vow1++]=a[i][j];
else
con[con1++]=a[i][j];
}
c[count++]='.';
}
i=0;
while(i<count)
{
if(vow[a1]=='\0'||con[b1]=='\0')
break;
printf(" %c",con[a1++]);
printf(" %c",vow[b1++]);
printf(" %c",vow[b1++]);
printf(" %c",vow[b1++]);
printf(" %c",con[a1++]);
printf("\n");
i++;
}
//puts(vow);
//puts(con);
getch();
}