#include<stdio.h>
#include<string.h>
int main()
{
	int i;
	char s1[100],s2[100];
	printf("\nEnter first string, s1: ");
	scanf("%s",s1);
	printf("\nEnter second string, s2: ");
	scanf("%s",s2);
	
	if(strlen(s1)==strlen(s2))
		printf("\nBoth the string lengths of above given strings, s1 and s2 are same.");
	else if(strlen(s1)>strlen(s2))
		printf("\nThe longest string between %s and %s is: %s",s1,s2,s1);
	else
		printf("\nThe longest string between %s and %s is: %s",s1,s2,s2);
	return 0;
	
}
