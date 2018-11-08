#include<stdio.h>
#include<string.h>
main()
{
	char s[100],temp;
	int i,len=0,c=0;				//c==flag variable
	scanf("%[^\n]",s);
	for(i=0;i<strlen(s)/2;i++)
		{
		if(s[i]==s[strlen(s)-i-1])
			continue;
		else
			c++;
		}
		if(c==0)
			printf("palindronme");
		else
			printf("not palindrome");
}
