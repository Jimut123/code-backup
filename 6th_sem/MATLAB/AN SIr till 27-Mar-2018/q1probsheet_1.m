%q1probsheet_1.m : Write a program to test whether a number is even or odd
clc;
close all;
clear all;
n=input('\nEnter any positive integer=');
r=mod(n,2);
if r==0
    fprintf('\n%d is even\n',n);
else
    fprintf('\n%d is odd\n',n);
end
%End of program
