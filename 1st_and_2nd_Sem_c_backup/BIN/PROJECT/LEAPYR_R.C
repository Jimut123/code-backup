/*******************************************************
Statement - Check leap year in a range.
Programmer - Vineet Choudhary
Written For - https://turboc.codeplex.com
*******************************************************/

#include <stdio.h>
#include <conio.h>

void main(){
    int year;
    int min_year,max_year;
    clrscr();

    printf("Enter the lowest year: ");
    scanf("%d",&min_year);

    printf("Enter the heighest year: ");
    scanf("%d",&max_year);

    printf("Leap years in given range are: ");
    for(year = min_year;year <= max_year; year++){
         if(((year%4==0)&&(year%100!=0))||(year%400==0))
             printf("%d ",year);
    }
  
    getch();
}

/*

Definition of leap year:
------------------------
Rule 1: 
-------
A year is called leap year if it is divisible by 400.
For example:
------------
1600, 2000 etc leap year while 1500, 1700 are not leap year.

Rule 2: 
-------
If year is not divisible by 400 as well as 100 but it is divisible by 4 then that year are also leap year.
For example:
------------
2004, 2008, 1012 are leap year.


Leap year logic or Algorithm of leap year or Condition for leap year:
---------------------------------------------------------------------
IF year MODULER 400 IS 0
 THEN leap_year
ELSE IF year MODULER 100 IS 0
 THEN not_leap_year
ELSE IF year MODULER 4 IS 0
 THEN leap_year
ELSE
 not_leap_year

*/