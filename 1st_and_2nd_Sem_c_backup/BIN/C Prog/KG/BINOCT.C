#include<math.h>
main()
{
	int dec,copy,copy1,i=0;
	unsigned long bin=0, oct=0;
	clrscr();
	printf("Enter a number in decimal: ");
	scanf("%d",&dec);
	copy=dec;
	copy1=dec;
	while(dec>0)
	{
		bin+=(dec%2)*pow(10,i++);
		dec/=2;
	}
	i=0;
	while(copy>0)
	{
		oct+=(copy%8)*pow(10,i++);
		copy/=8;
	}
	printf("%d in decimal = %lu in binary",copy1,bin);
	printf("\n%d in decimal = %lu in octal",copy1,oct);
	getch();
}