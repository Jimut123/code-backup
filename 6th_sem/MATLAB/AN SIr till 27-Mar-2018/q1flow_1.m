%q1flow_1.m : Write a program to calculate (i) largest value, (ii) smallest
%value from 3 arbitrary numbers
clc;
close all;
clear all;
a=input('\nEnter your 1st number=');
b=input('\nEnter your 2nd number=');
c=input('\nEnter your 3rd number=');
%To get largest value
big=a;
    if b> big
        big=b;
    end
    if c>big
        big=c;
    end
    small=a;
    if b<small
        small=b;
    end
    if c<small
        small=c;
    end
    fprintf('\nLargest value=%d smallest value=%d\n',big,small);
    %End of program
    

