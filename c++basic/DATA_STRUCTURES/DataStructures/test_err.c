#include "e4c.h"
int foobar(){
    int *pointer = NULL;
    try{
        int oops = *pointer;
    }catch(BadPointerException){
        printf("No probs!");
    }

}
