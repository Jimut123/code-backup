#include <time.h>
#include <stdlib.h>
int main(){
int i;
srand(time(NULL));   // should only be called once
for(i=0;i<100;i++){
int r = rand()%20;      // returns a pseudo-random integer between 0 and RAND_MAX
printf("%d ",r);
}
}

