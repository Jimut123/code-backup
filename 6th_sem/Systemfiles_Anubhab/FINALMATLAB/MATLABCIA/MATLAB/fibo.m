%fibo.m: Write a program to print fibonacci series of n terms.

clc;
close all;
clear all;
n=input('\nEnter number of terms of fibonacci series(1-10): ');
for i = 1:n
    y=fib(i);
    fprintf('%d\t',y);
end
fprintf('\n');
%End of program