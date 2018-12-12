 #include<stdio.h>
 #define sap(a,b) temp=a; a=b; b=temp;
 int main()
 {
 	static int a=5,b=6,temp;
 	if(a>b)
 		swap(a,b);
 		printf("%d %d",a,b);
 	return 0;
 }
