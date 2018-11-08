#include<stdio.h>
//#include<conio.h>
#include<string.h>
main()
{
	char s[100],temp;
	int i,len=0;
	scanf("%[^\n]",s);
	//printf("%s",s);
	for(i=0;i<strlen(s)/2;i++)
		{
			temp=s[i];
			s[i]=s[strlen(s)-i-1];
			s[strlen(s)-i-1]=temp;			
		}
	printf("\n%s",s);
	
}
