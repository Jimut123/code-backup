#include<stdio.h>
#include<stdlib.h>
//#include<cstdlib.h>

int main(int argc, char* argv[argc+1]){
    puts("Hello World!");
    if(argc>1){
        while(true){
            puts("Some progs never stops");
        }
    } else{
        do{
            puts("But this one does!");
        }while(false);
    }
    return EXIT_SUCCESS;
}