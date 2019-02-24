%prog1.m:Input 3 numbers and find largest value and display it.
clc;
close all;
clear all;
a=input('\nEnter 1st number=');
b=input('\nEnter 2nd number=');
c=input('\nEnter 3rd number=');
%Largest value
big=a;
if b>big
    big=b;
end
if c>big
    big=c;
end
fprintf('a=%d, b=%d, c=%d, largest value is %d', a,b,c,big);
%End of program
