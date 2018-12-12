#include<stdio.h>
#include<string.h>
int isvowel(char);
main()
{
	char s[100];
	int i,len=0;
	int countnum=0,countlc=0,countuc=0,vowel=0;
	scanf("%[^\n]",s);
	for(i=0;s[i]!='\0';i++){
		if(s[i]>47 && s[i]<58)
			countnum++;
		else if(s[i]>64 && s[i]<91)
			countuc++;
		else if(s[i]>96 && s[i]<123)
			countlc++;
			
		if(isvowel(s[i]))
			vowel++;
	}
	printf("countnum=%d, countuc=%d, countlc=%d, vowel=%d",countnum,countuc,countlc,vowel);
	printf("\n",i);
}

int isvowel(char c)
{
	if((c =='a') || (c=='e')|| (c=='i') || (c=='o')|| (c=='u'))
		return 1;
	else		
		return 0;
}
