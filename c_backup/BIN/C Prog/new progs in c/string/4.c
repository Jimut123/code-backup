#include<stdio.h>
#include<string.h>
main()
{
	char s[100],s1[100];
	int i,len=0;
	scanf("%[^\n]",s);
/*	for(i=0;s[i]!='\0';i++)
	{
		if(s[i]==' ' && s[i+1]==' ')
			continue;
		printf("%c",s[i]);
	}*/
	for(i=0;i<strlen(s);i++)
	{
		s1[i]=s[i];
	}
//	s1[100]=s[100];
	printf("%s",s1);
}
