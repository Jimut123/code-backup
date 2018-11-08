import java.util.*;
public class saptarshimatrix
{
void sum()
{
Scanner sc=new Scanner(System.in);
int a,c,d,e,g,h,i,j,aa,bb,cc,dd,ee,gg;
System.out.println("ENTER LIMIT");
a=sc.nextInt();
int b[][] = new int[a][a];
for(c=0;c<a;c=c+1)
{
b[c][c]=1;
}
h=a-1;
for(d=0;d<a;d=d+1)
{
b[h][d]=1;
h=h-1;
}
for(i=0;i<a;i=i+1)
{
for(j=0;j<a; j=j+1)
{
if(b[i][j]==1)
{
break;
}
else
{
b[i][j]=3;
}}}
for(aa=a-1;aa>=0;aa=aa-1)
{
for(bb=a-1;bb>=0;bb=bb-1)
{
if(b[aa][bb]>0)
{
break;
}
else
{
b[aa][bb]=4;
}
}
}
for(cc=0;cc<a/2;cc=cc+1)
{
for(dd=0;dd<a;dd=dd+1)
{
if(b[cc][dd]>0)
{
continue;
}
else
{
b[cc][dd]=2;
}
}}

for(ee=a-1;ee>=a/2;ee=ee-1)
{
for(gg=a-1;gg>=0;gg=gg-1)
{
if(b[ee][gg]>0)
{
continue;
}
else
{
b[ee][gg]=5;
}
}}





for(e=0;e<a;e=e+1)
{
for(g=0;g<a;g=g+1)
{
System.out.print(b[e][g]);
}
System.out.println();
}

}}
