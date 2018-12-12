#include<stdio.h>
#include<string.h>
main()
{
	char s[100],s1[100],s2[100];
	int i,j;
	scanf("%[^\n] %[^\n]",s1,s2);
	for(i=0;i<strlen(s1);i++)
	{
		s[i]=s1[i];
	}
	for(j=0;j<strlen(s2);j++)
	{
		s[i]=s2[j];
		i++;
	}
	printf("%s",s);
}
