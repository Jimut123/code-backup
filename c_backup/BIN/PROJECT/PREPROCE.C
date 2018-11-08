/*******************************************************
 Statement - Preprocessor - Understand program
 Programmer - Vineet Choudhary
 Written For - https://turboc.codeplex.com
 *******************************************************/

#include <stdio.h>
#include <conio.h>
#define TRUE         1
#define FALSE        (!TRUE)
#define GREATER(a,b) ((a) > (b) ? (TRUE) : (FALSE))
#define PIG_LATIN    FALSE
void main();
void main()
{
    int x, y;
    clrscr();
#if PIG_LATIN
    printf("Easeplay enternay ethay aluevay orfay xnay: ");
    scanf("%d", &x);
    printf("Easeplay enternay ethay aluevay orfay ynay: ");
    scanf("%d", &y);
#else
    printf("Please enter the value for x: ");
    scanf("%d", &x);
    printf("Please enter the value for y: ");
    scanf("%d", &y);
#endif
    if (GREATER(x,y) == TRUE)
    {
#if PIG_LATIN
        printf("xnay islay eatergray anthay ynay!\n");
#else
        printf("x is greater than y!\n");
#endif
    }
    else
    {
#if PIG_LATIN
        printf("xnay islay otnay eatergray anthay ynay!\n");
#else
        printf("x is not greater than y!\n");
#endif
        getch();
    }
}

/*
 
 This program uses preprocessor directives to define symbolic constants (such as TRUE, FALSE, and PIG_LATIN), a macro (such as GREATER(a,b)), and conditional compilation (by using the #if statement). When the preprocessor is invoked on this source code, it reads in the stdio.h file and interprets its preprocessor directives, then it replaces all symbolic constants and macros in your program with the corresponding values and code. Next, it evaluates whether PIG_LATIN is set to TRUE and includes either the pig latin text or the plain English text.
 
 If PIG_LATIN is set to FALSE, as in the preceding example, a preprocessed version of the source code would look like this:
 
 Here is where all the include files would be expanded.
 void main(void)
 {
 int x, y;
 printf("Please enter the value for x: ");
 scanf("%d", &x);
 printf("Please enter the value for y: ");
 scanf("%d", &y);
 if (((x) > (y) ? (1) : (!1)) == 1)
 {
 printf("x is greater than y!\n");
 }
 else
 {
 printf("x is not greater than y!\n");
 }
 }
 This preprocessed version of the source code can then be passed on to the compiler. If you want to see a preprocessed version of a program, most compilers have a command-line option or a standalone preprocessor program to invoke only the preprocessor and save the preprocessed version of your source code to a file. This capability can sometimes be handy in debugging strange errors with macros and other preprocessor directives, because it shows your source code after it has been run through the preprocessor.
 
 */
