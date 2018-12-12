/* Write a program to compute the division from the given marks of 5 subjects.
The division can be calculated as follows: -
Average Mark	Division
>=60		First
>=50		Second
>=40		Third
<40		Fail */

#include <stdio.h>
main()
{
	int m1,m2,m3,m4,m5;
	float per;
	printf("\nENTER THE MARKS OF THE SUBJECTS:\n");
	scanf("%d %d %d %d %d",&m1,&m2,&m3,&m4,&m5);
	per=(m1+m2+m3+m4+m5)/5.0;
	printf("\n Percentage obtained is %f",per);
	if(per>=60)
		printf("\nFIRST DIVISION");
	else
	{
		if(per>=50)
			printf("\nSECOND DIVISION");
		else
		{
			if(per>=40)
				printf("\nTHIRD DIVISION");
			else
				printf("\nFAIL");

		}
	}
}
