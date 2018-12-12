/*  Write a program to check a given number is Palindrome or not.   */
/*  A number is said to be Palindrome
    if the reverse of the number is equal to the number.*/

#include <stdio.h>
main()
{
	unsigned long num,temp,pal,sum=0;
	printf("\nENTER A NUMBER: ");
	scanf("%lu",&num);
	temp=num;
	do
	{
		pal=num%10;
		num=num/10;
		sum=(sum*10)+pal;
	}
	while(num!=0);
	if(temp==sum)
		printf("\n%lu IS A PALINDROME NUMBER",temp);
	else
		printf("\n%lu IS NOT A PALINDROME NUMBER",temp);
}
