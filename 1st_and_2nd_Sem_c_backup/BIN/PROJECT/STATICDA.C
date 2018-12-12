/**********************************************************
 Statement - Write static data in file and read from file
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 **********************************************************/


#include<stdio.h>
#include<conio.h>

struct Student {
    int roll;
    char name[12];
    int percent;
} s1 = { 96, "VINEET", 76 };

void main() {
    FILE *fp;
    struct Student s2;
    clrscr();
    
    //Write details of s1 to file
    fp = fopen("ip.txt", "w");
    fwrite(&s1, sizeof(s1), 1, fp);
    fclose(fp);
    
    //Read saved details from file
    fp = fopen("ip.txt", "r");
    fread(&s2, sizeof(s2), 1, fp);
    fclose(fp);
    
    printf("\nRoll : %d", s2.roll);
    printf("\nName : %s", s2.name);
    printf("\nPercent : %d", s2.percent);
    
    getch();
}
