//copying of string from str1[] to str2[]
#include<stdio.h>
#include<string.h>
int main()
{
	int i;
	char str1[100], str2[100];
	
	printf("\nEnter your string, s1[]: ");
	scanf("%[^\n]",str1);
	printf("\nYou entered: ");
	puts(str1);
	strcpy(str2,str1);
	printf("\nRequired string, s2[]: ");
	puts(str2);
	return 0;
}
