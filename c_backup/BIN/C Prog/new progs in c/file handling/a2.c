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
		if(ch>64 && ch<91)
		{
		printf("%c",ch);
		fputc(ch,q);
		}
	
		else if(ch>96 && ch<123)
		{
		printf("%c",ch-32);
		fputc(ch-32,q);
		}
		
		else 
		{
		printf("%c",ch);
		fputc(ch,q);
		}
	}
}
	fclose(p);
	fclose(q);
}
