	/*q3as1.c : Write a program to display all fibonacci numbers
	<=n where n>=2 and n<=2000 */
	#include<stdio.h>
	main()
	{
        int f1,f2,f3,n;
        char ch;
        do
        {
            while(1)
                {
                    printf("\nEnter n(2-2000) :");
                    scanf("%d",&n);
                        if(n<2 || n>2000)
                            printf("\nInvalid data\n");
                        else
                            break;
                }
		f1=1;
        f2=1;
        printf("\nFibonacci numbers<=%d===>\n",n);
        printf("%d\n%d\n",f1,f2);
            while((f3=f1+f2)<=n)
            {
                printf("%d\n",f3);
                f1=f2;
                f2=f3;
            }
        printf("\nDo you want to continue(Y/N?) :");
        ch=getch();
        }while(ch=='y' || ch=='Y');
	}
