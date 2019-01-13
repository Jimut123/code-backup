%q22nas1.m : Write a program to display all prime fibonacci numbers
clc;
close all;
clear all;
n=input('\nEnter n(2-2000=');
count=0;
f1=1;
f2=1;
f3=f1+f2;
    while f3<=n
        m=is_prime(f3);
            if m==1
                count=count+1;
                fprintf('%d\t',f3);
            end
            f1=f2;
            f2=f3;
            f3=f1+f2;
    end
    fprintf('\nTotal prime Fibonacci numbers <=%d is %d\n',n,count);
    %end of main program
    
        