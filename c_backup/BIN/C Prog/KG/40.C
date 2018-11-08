/*Arrays: Write a program to create an array.
Print the values and addresses of each elements of the array.*/
#include <stdio.h>
main()
{
	int a[20],n;
	int i;
	printf("\n Enter how many numbers in the array(<20):");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("\nENTER THE NUMBER-%d: ",i+1);
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	printf("ARRAY ELEMENT-%d: VALUE=%d, ADDRESS=%u\n",i+1,a[i],&a[i]);
}
