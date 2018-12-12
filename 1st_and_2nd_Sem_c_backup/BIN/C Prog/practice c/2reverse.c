#include<stdio.h>
#include<string.h>
int main()
{
	int i,len=0;
	char s[50],s1[50];
	printf("Enter a string: ");
	scanf("%[^\n]",s);
	for(i=0;i<=strlen(s);i++)
	{
		s1[i]=s[strlen(s)];
		
	}
	printf("%s",s1);
	
	
}
