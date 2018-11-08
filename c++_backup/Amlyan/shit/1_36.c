#include<stdio.h>
int main()
{
	enum status {pass,fail,atkt};
	enum status stud1,stud2,stud3;
	stud1 = pass;
	stud2 = atkt;
	stud3 = fail;
	printf("\n %d %d %d",stud1,stud2,stud3);
	return 0;
}
