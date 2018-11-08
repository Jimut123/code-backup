#include<stdio.h>
main()
{
	FILE *p,*q,*r;
	char ch;
	p=fopen("C:/Users/Dhananjoy/Desktop/a.txt","r");
	q=fopen("C:/Users/Dhananjoy/Desktop/b.txt","r");
	r=fopen("C:/Users/Dhananjoy/Desktop/c.txt","w");
	while((ch=fgetc(p))!=EOF)
	{
		printf("%c",ch);
		fputc(ch,r);
	}
	fclose(p);
	while((ch=fgetc(q))!=EOF)
	{
		printf("%c",ch);
		fputc(ch,r);
	}
	fclose(q);
	fclose(r);
}
