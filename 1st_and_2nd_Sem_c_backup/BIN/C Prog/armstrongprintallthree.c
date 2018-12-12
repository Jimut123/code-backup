#include<stdio.h>

int main(){
	
	int s,n,r,m;
	
	for(n=1;n<=1000;n++)
	{
		m=n;
		s=0;
		while(m>0){
		
		r=m%10;
		s=s+r*r*r;
		m=m/10;
	}
		if(n==s)
		printf("%d\t",n);
	}
			
	   return 0;
	
}
