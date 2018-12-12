#include<stdio.h>
#include<string.h>
main()
{
	FILE *fp;
	char ch;
	int l=0,a=0,w=0;
	fp=fopen("abc.txt","w");
	while(!fp)
	{
		printf("Error!!!...");
	}
	while(ch=getchar())
	{
		putc(ch,fp);
		if(ch==EOF)
		{
		putc('\n',fp);
		break;			
		}
	}
	fclose(fp);
	fp=fopen("abc.txt","r");
	while(!feof(fp))
	{
		ch=getc(fp);
		printf("%c",ch);
		//fputc(ch);
		if(ch=='\n')
			l++;
		if(ch==' ')
			w++;
		if((int)ch>96 && (int)ch<145)
			a++;
	}
	printf("Line:- %d Word:- %d Alphabet:- %d",l,w+l,a);
	fclose(fp);
	return 0;	
}
