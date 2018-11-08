#include<stdio.h>
void main()
{
int x=0,k,y=-1,z=1,a=0,b=-1,c=1;
clrscr();
k=x&&y;

printf("k = %d x = %d y = %d\n",k,x,y); // prints 0 0 -1
					/*so when the condition becomes 0 the
					&operation doesn't takes place */
k=y&&z;
printf("k = %d y = %d z = %d\n",k,y,z);//prints 1 -1 1
					/* the condition being true works as
					    it is*/

x=0;y=-1;z=1;a=0;b=-1;c=1;
k=++x||++y&&++b;
printf("k = %d x = %d y = %d b = %d\n",k,x,y,b);//prints 1 1 -1 -1
				/*since the 1st condition is
				  is true, the rest are skipped*/
x=0;y=-1;z=1;a=0;b=-1;c=1;
k=--x&&++y||++b;
printf("k = %d x = %d y = %d b = %d\n",k,x,y,b);//prints 0 -1 0 0
				/*since the 1st condition is -1 and is there
				so the nex condition is checked but 0 is anded
				and the next case 0+0=0*/
x=0;y=-1;z=1;a=0;b=-1;c=1;
k=z--&&y++||++a||c==1;
printf("k = %d z = %d y = %d a = %d c==1? %d\n",k,z,y,a,c==1);
a=0;c=1;
k=++a||c==1;
printf("k = %d a = %d c = %d\n",k,a,c); // 1 1 1
k=c==0&&c!=1;
printf("k = %d c = %d\n",k,c);
getch();
}