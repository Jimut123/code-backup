
	/*************************************************
	* Assignment 5 .... Question 5                	 *
	* Program to merge two sorted integer files   	 *
	* into a third file and to print the contents 	 *
	* of the merged sorted output file on the screen *
	* Using Command Line Arguments 			 *
	*************************************************/

#include<stdio.h>

void main(int argc, char *argv[])
{
	FILE *f1,*f2,*f3;
	int a[10],b[10],c[20],i,j,n1,n2,k;
	f1=fopen(argv[1],"r");
	f2=fopen(argv[2],"r");
	f3=fopen(argv[3],"w");
	clrscr();

	/* Checking number of arguments */

	if (argc!=4)
	{
		gotoxy(10,10);
		printf("Invalid number of arguments....");
		getch();
		exit();
	}

	if (strcmp(argv[1],"a.dat")!=0 || strcmp(argv[2],"b.dat")!=0)
	{
		gotoxy(10,10);
		printf("Files not integer files....Merging not possible.");
		getch();
		exit();
	}

	gotoxy(10,5);
	printf("The data of the first input file is as follows....\n\n");
	i=0;
	while(fscanf(f1,"%d",&a[i])!=EOF)
	{
		printf("\t %d",a[i]);
		i++;
	}
	n1=i;

	gotoxy(10,10);
	printf("The data of the second input file is as follows....\n\n");
	i=0;
	while(fscanf(f2,"%d",&b[i])!=EOF)
	{
		printf("\t %d",b[i]);
		i++;
	}
	n2=i;
	i=0;
	for(i=0,j=0,k=0;i<n1 && j<n2;k++)
	if(a[i]>b[j])
	{
		c[k]=b[j];
		j++;
	}
	else
	{
		c[k]=a[i];
		i++;
	}
	for(;i<n1;i++,k++)
		c[k]=a[i];
	for(;j<n2;j++,k++)
		c[k]=b[j];

	gotoxy(10,15);
	printf("The merged data of the output file is as follows....\n\n");
	for(i=0;i<n1+n2;i++)
	{
		fprintf(f3,"\t %d",c[i]);
		printf("\t %d",c[i]);
	}
	fclose(f1);
	fclose(f2);
	fclose(f3);
	getch();
}
