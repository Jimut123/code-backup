%q4as1.m : Write main program to calculate hcf,lcm of 2 numbers

clc;
close all;
clear all;
a=input('\nEnter 1st number = ');
b=input('\nEnter 2nd number = ');
h=hcf1(a,b);
l=lcm1(a,b);
fprintf('\na = %d b = %d hcf = %d lcm = %d\n',a,b,h,l);
%end of program