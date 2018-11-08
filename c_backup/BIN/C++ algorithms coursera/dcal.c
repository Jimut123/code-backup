#include <stdio.h>
#include <stdlib.h>
#define MIN(a,b) ((a) < (b)) ? (a) : (b)
#define NO_OP 0
#define SUB_1 1
#define DIV_2 2
#define DIV_3 3

int main(void) {
        int num=10;
        int i,c=0;
        int *out;
        int *res;
        int t[100];

        //printf("Enter the number: ");
        scanf("%d", &num);

        out = (int*)malloc(sizeof(int) * (num+1));
        res = (int*)malloc(sizeof(int) * (num+1));

        out[1] = 0;
        res[1] = NO_OP;
        for(i=2; i <= num; i++) {
                out[i] = out[i-1] + 1;
                res[i] = SUB_1;
                
                if (i%2 == 0) {
                    if ((out[i/2] + 1) < out[i]) {
                        res[i] = DIV_2;
                    }
                    out[i] = MIN(1 + out[i/2], out[i]);
                }
                if (i%3 == 0) {
                    if ((out[i/3] + 1) < out[i]) {
                        res[i] = DIV_3;
                    }
                    out[i] = MIN(1 + out[i/3], out[i]);
                }
        }

        printf("%d\n", out[num]);
        
        // Print the sequence, we already know the number of steps to print
        for (i = out[num]; i > 0; i--) {
            //printf("%d,", res[num]);
            
            if (res[num] == SUB_1) {
            	t[c++]=num - 1;
                num = num - 1;
                printf("%d ",num);
            } else if (res[num] == DIV_2) {
            	t[c++]=num / 2;
                num = num / 2;
                 printf("%d ",num);
            } else {
            	t[c++]=num / 3;
                num = num / 3;
                 printf("%d ",num);
            }
        }
       // printf("\n");
       // for(i=0;i<c;i++)
        //printf("%d\t",t[i]);
        printf("\n");
        
        return 0;
}
