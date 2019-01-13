%q4as1.m: Write a program to calculate hcf, lcm of 2 numbers
clc;
close all;
clear all;
a=input('\nEnter 1st number=');
b=input('Enter 2nd number=');
h=hcf(a,b);
lc=lcm(a,b);
fprintf('a=%d b=%d hcf=%d lcm=%d\n',a,b,h,lc);
%end of program


