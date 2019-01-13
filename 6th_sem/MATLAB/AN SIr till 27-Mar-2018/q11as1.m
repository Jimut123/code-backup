%q11as1.m : Write main program to calculate s=(1)+(1+2)+(1+2+....+n)
clc;
close all;
clear all;
n=input('\nEnter n(1-10)=');
y=sum1(n);
fprintf('\nSum of %d numbers=%d\n',n,y);
%End of main module
