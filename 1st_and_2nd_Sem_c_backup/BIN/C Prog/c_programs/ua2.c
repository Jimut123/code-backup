#include<stdio.h>
#include<string.h>
void reverse();
int main()
/*{
	int i,temp;
	char arr[100];
	printf("\nEnter a string to be reversed: ");
	scanf("%s",arr);
	for(i=0;i<strlen(arr)/2;i++)
	{
		temp=arr[i];
		arr[i]=arr[strlen(arr)-1-i];
		arr[strlen(arr)-1-i]=temp;
	}
	printf("\nNow the reversed string is: %s",arr);
	return 0;
}*/
{
	printf("\nEnter string: ");
	scanf("%c",&c);
	reverse();
	return 0;
}
void reverse()
{
	char c;
	if(c!='\n')
	{
		reverse();
		printf("%c",c);
	}
}
	
