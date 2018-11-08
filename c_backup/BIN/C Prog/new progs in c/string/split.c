#include<stdio.h>
#include<string.h>
main()
{
	char s[100],s1[50],s2[50];
	int i,j=0;
	scanf("%[^\n]",s);
	/*for(i=0;i<strlen(s)/2;i++)
	{
		s1[i]=s[i];
	}
	for(i;i<strlen(s);i++)
	{
		s2[j]=s[i];
		j++;
	}*/
	for(i=0;i<strlen(s);i++)
	{
		if(i<(int)(strlen(s)/2))			//type casting 
			s1[i]=s[i];
		else
			s2[j++]=s[i];
	}
	printf("%s \n%s",s1,s2);
}
