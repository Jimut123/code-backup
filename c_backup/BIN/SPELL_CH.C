#include<stdio.h>
void main()
{
int i,l,c=0,j,a[12],max,k=0,len[12],dif[12],min,d[12],v=1,t1[12],t2[12],t3[12];
int t0[12],t01[12];
char s[100];
char q[100][100]={{"Christmas"},
	    {"Amlyan"},
	    {"Jimut"},
	    {"Simut"},
	    {"Sachin"},
	    {"Rounak"},
	    {"google"},
	    {"facebook"},
	    {"twitter"},
	    {"instagram"},
	    {"whatsapp"},
	    {"zebra"},
	    {"cab"},
	    };
clrscr();
printf("List of words :: \n");
for(i=0;i<12;i++)
{
k=0;
for(j=0;q[i][j]!='\0';j++)
{
printf("%c",q[i][j]);
k++;
}
len[i]=k;
printf("\n");
}
printf("\nEnter a word of your choice ::");
gets(s);
l=strlen(s);
for(i=0;i<12;i++)
{
c=0;
for(j=0;q[i][j]!='\0';j++)
{
if(q[i][j]==s[j] || q[i][j]-s[j]==32 ||s[j]-q[i][j]==32)
{
c++;
}
}
a[i]=c;
}
max=a[0];
for(i=0;i<12;i++)
{
if(a[i]>max)
{
max=a[i];
j=i;
}
}
printf("\nFrom the first perspective, your word should be ::");
puts(q[j]);
k=0;
for(i=0;i<12;i++)
{
if(l>len[i])
dif[i]=l-len[i];
else if(len[i]>l)
dif[i]=len[i]-l;
else
dif[i]=0;
}
min=dif[0];
k=-1;
for(i=0;i<12;i++)
{
if(min>dif[i])
{
min=dif[i];
}
}
k=-1;
for(i=0;i<12;i++)
{
v=1;
if(min==dif[i])
{
j=i;
k++;
v=0;
}
if(k>=0&&v==0)
{
d[k]=j;
}
v=1;
}
printf("\nFrom the Second perspective, your word should be ::");
for(i=0;i<=k;i++)
{
puts(q[d[i]]);
}
k=0;
v=0;
for(i=0;i<12;i++)
{
k=0;
for(j=0;q[i][j]!='\0';j++)
{
if(q[i][j]==s[k]||q[i][j]-s[k]==32||s[k]-q[i][j]==32)
{
k++;
}
}
t0[v++]=k;
}
for(i=0;i<=v;i++)
{
if(t0[i]>max)
{
max=t0[i];
j=i;
}
}
k=0;
for(i=0;i<=v;i++)
{
if(max==t0[i])
{
t01[k++]=i;
}
}
printf("From the 3rd perspective we get ::");
for(i=0;i<k;i++)
puts(q[t01[i]]);

for(i=0;i<12;i++)
{
k=0;
for(j=0;q[i][j]!='\0';j++)
{
if(q[i][j]==s[k]||q[i][j]-s[k]==32||s[k]-q[i][j]==32)
{
k++;
}
}
t0[v++]=k;
}

getch();
}