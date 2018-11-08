#include<stdio.h>

 int main(){
 	
 	int first=0,sec=1,next,n,i;
 	
	 printf("\nEnter The limit ");
 	scanf("%d",&n);
 	
 	for(i=1;i<=n;i++)
	 {
	 

    next=first+sec;
    
    sec=first;
    
    next=sec;
    
    printf("%d",next);
}
 	return 0;
 }
 	
 	
 	
 	
 	
 	
 	
 	
 	
 
