#include<stdio.h>
main()
{
	FILE *p;
	char ch;
	p=fopen("C:/Users/Dhananjoy/Desktop/a.txt","r");
	if(!p)
		printf("error!!");
	else{
	while((ch=fgetc(p))!=EOF)
	{
		printf("%c",ch);
	}
	}
	fclose(p);
}
