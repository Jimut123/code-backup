#include<stdio.h>
#include<conio.h>
 void main()

 {
 int a,b,c;  clrscr();
 printf("enter 3 numbers\n");
 scanf("%d\%d\%d",&a,&b,&c);

 if(a>b)
 {
 if(a>c)
 {printf("%d is large",a);
 }
 else
 {printf("%d is large",c);
 }
 }
 else{
 if(b>c)
 {printf("%d is large",b);
 }
 else
{printf("%d is large",c);
}
}
getch();
}
			      .////////////