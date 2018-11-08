/********************** To fond the max and min word ************************
*********************** By -- Jimut Bahan Pal        ************************
*****************************************************************************/
#include<stdio.h>
void main()
{
char s[100],s1[100][100],ch;
int i,l,v=0,m=0,mx,mn,len[100],j,k;
clrscr();
printf("Enter a String::");
gets(s);
l=strlen(s);
for(i=0;i<l;i++)
{
ch=s[i];

if(ch!=' '&&ch!='\0')
{
s1[m][v]=ch;
//printf("s1[v][m] = %c m = %d v = %d\n",s1[m][v],m,v);
len[m]=v+1;
//printf("len[m] = %d m = %d",v,m);
v++;
}
if(ch==' '||ch=='\0')
{
s1[m][v]='\0';
//printf("s1[v][m] = %c m = %d v = %d\n",s1[m][v],m,v);
//printf("len[m] = %d m = %d",v,m);
v=0;
m++;
}
}
mx=len[0];
mn=len[0];
//printf("\n\n mx = %d mn= %d \n\n",mx,mn);
for(i=0;i<=m;i++)
{
//printf("len[i] = %d   i = %d\n ",len[i],i);
}
for(i=0;i<=m;i++)
{
if(mx>=len[i])
{
mx=len[i];
j=i;
}
if(mn<=len[i])
{
mn=len[i];
k=i;
}
}
//printf("\n\n j = %d k = %d \n\n",j,k);
printf("Max word ==");
for(i=0;s1[k][i]!='\0';i++)
printf(" %c",s1[k][i]);
printf("\n\n");
//printf("\n\nNo. of characters is ::\n\n",len[k]);
printf("Minimum word ==");
for(i=0;s1[j][i]!='\0';i++)
printf(" %c",s1[j][i]);
//printf("\n\nNo. of characters is ::\n\n",len[j]);
getch();
}