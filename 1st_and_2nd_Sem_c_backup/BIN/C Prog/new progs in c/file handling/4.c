#include<stdio.h>
main()
{
	FILE *p,*q;
	char ch;
	p=fopen("C:/Users/Dhananjoy/Desktop/a.txt","r");
	q=fopen("C:/Users/Dhananjoy/Desktop/b.txt","w");
	if(!p)
		printf("error!!");
	else{
	while((ch=fgetc(p))!=EOF)
	{
		printf("%c",ch);
		fputc(ch,q);
	}
	}
	fclose(p);
	fclose(q);
}
