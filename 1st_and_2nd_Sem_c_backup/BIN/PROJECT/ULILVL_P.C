/**********************************************************
 Statement - Multilevel Pointer [With Explanation]
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/


#include<stdio.h>
#include<conio.h>

void main(){
    int s=2,*r=&s,**q=&r,***p=&q;
    clrscr();
    
    printf("%d",p[0][0][0]);
    
    getch();
}

/*
 Multilevel Pointer
 -------------------
 A pointer is pointer to another pointer which can be pointer to others pointers and so on is known as multilevel pointers. We can have any level of pointers.
 
 Explanation
 -------------
 As we know p[i] =*(p+i)
 So,
 P[0][0][0]=*(p[0][0]+0)=**p[0]=***p
 Another rule is: *&i=i
 So,
 ***p=*** (&q) =**q=** (&r) =*r=*(&s) =s=2
 */