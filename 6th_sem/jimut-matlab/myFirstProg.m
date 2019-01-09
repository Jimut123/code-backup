
%xxprog1.m : input three arbitary numbers and print the largest value
clc;
close all;
clear all;
a=input('\n Enter first number : ');
b=input('Enter second number : ');
c=input('Enter 3rd number : ')
%To get the largest value

big=a;
if b>big
    big=b;
end
if c>big
    big=c;
end

fprintf('a = %d, b = %d c=%d largest value=%d\n',a,b,c,big);

