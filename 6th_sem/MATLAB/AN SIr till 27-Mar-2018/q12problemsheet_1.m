%q12problemsheet_1.m : Write a program to input any +ve integer
%'n'(2-2000). Print all fibonacci numbers <=n
clc;
close all;
clear all;
n=input('\nEnter n(2-2000)=');
f1=1;
f2=1;
fprintf('\nFiobonacci series -->\n');
fprintf('%d\n%d\n',f1,f2);
f3=f1+f2;
    while f3<=n
        fprintf('%d\n',f3);
        f1=f2;
        f2=f3;
        f3=f1+f2;
    end
 %End of program
 