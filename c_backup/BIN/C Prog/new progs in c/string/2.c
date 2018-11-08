#include<stdio.h>
#include<string.h>
main()
{
	char s[100];
	int i,len=0;
	scanf("%[^\n]",s);
	for(i=0;s[i]!='\0';i++)
	{
		if(s[i]==' ')
			continue;
		len++;
		printf("%c",s[i]);
	}
	printf("\nnum=%d",len);
	printf("\n",i);
}
