/* Write a program to ask the user to enter a series of marks of a student.
If the user enters -1, come out of the loop and print the average mark. */

#include <stdio.h>
main()
{
	int mark,num=0;
	float sum=0.0,avg=0.0;
	clrscr();
	printf("\nEnter Marks one by one Or -1 To Quit: \n");
	scanf("%d",&mark);
	while(mark!=-1)
	{
		sum+=mark;	/* sum=sum+mark;  */
		num+=1;         /* num=num+1;  */
		scanf("%d",&mark);
	}
	avg=(float)sum/num;
	printf("\nAverage Mark: %.2f",avg);
	getch();
}