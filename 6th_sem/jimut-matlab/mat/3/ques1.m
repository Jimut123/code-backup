%Write main function to calculate s=1+(1+2)+(1+2+3)+..+(1+2+3+..+n)
clc;
close all;
clear all;
n=input('\nEnter n: ');
s=sum1(n);
fprintf('\nn=%d sum=%d',n,s);
