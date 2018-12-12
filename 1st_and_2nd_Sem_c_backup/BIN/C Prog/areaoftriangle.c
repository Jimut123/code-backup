#include<stdio.h>

 int main(){
 	int a,b,c,p;
 	float area,s;
 	printf("\nEnter the arms of the triangle ");
 	scanf("%d %d %d",&a,&b,&c);
 	
 	s=(a+b+c)/(float)2;
 	area=s*(s-a)*(s-b)*(s-c);
 	for(c=0,p=1;area;area-=p,p+=2,c++);
    printf("The required area of the triangle is %f ",c);
 	
 	return 0;
 	
 }
