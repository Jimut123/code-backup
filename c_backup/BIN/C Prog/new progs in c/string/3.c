#include<stdio.h>
#include<string.h>
main()
{
	char s[100];
	int i,len=0;
	scanf("%[^\n]",s);
	for(i=0;s[i]!='\0';i++)
	{
		if(s[i]>64 && s[i]<91)
			s[i]=s[i]+32;
		else if(s[i]>96 && s[i]<123)
			s[i]=s[i]-32;
		printf("%c",s[i]);
	}
}
