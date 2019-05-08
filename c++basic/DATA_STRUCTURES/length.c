#include<stdio.h>
#define STRSIZE 80
char string[STRSIZE];

int strlen(char string[])
	//char string[];
{
	int i;
	for(i=0;string[i]!='\0';i++);
	return(i);
}
int strpos(char s1[], char s2[])
{
	int len1,len2;
	int i,j1,j2;
	len1 = strlen(s1);
	len2 = strlen(s2);

	for(i=0;i+len2<=len1;i++)
		for(j1=i,j2=0;j2<=len2 && s1[j1] == s2[j2];j1++,j2++)
			if(j2==len2)
				return(i);
	return(-1);
}
void strcat(char s1[],char s2[])
{
	int i,j;
	for(i=0;s1[i]!='\0';i++);
	for(j=0;s2[j]!='\0';s1[i++]=s2[j++]);
}

int main()
{
	char str[20],str1[20],con_str[20];
	printf("\n Enter a string : ");
	scanf("%s",&str);
	printf("%s",str);
	printf("\n Length of the string : %d",strlen(str));
	printf("\n Enter another string : ");
	scanf("%s",&str1);
	strcat(str,str1);
	printf("\n The concatenated string : %s \n",str);
	return 0;
}
