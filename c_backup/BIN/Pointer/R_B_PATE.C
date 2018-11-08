#include<stdio.h>
#include<string.h>
void main(void)
{
enum empcats{Principal,Professor,Lecturer,Clerical};
struct
{
char name[30];
float salary;
enum empcats Category;
}employee;
strcpy(employee.name,"R.B.Patel");
employee.salary=16298.50;
employee.Category=Professor;
printf("Name = %s\n",employee.name);
printf("Salary = %8.2f\n",employee.salary);
printf("Category = %d\n",employee.Category);
if(employee.Category==Professor)
printf("Employee category is Professor.\n");
else
printf("Employee caegory is not professor.\n");
}
