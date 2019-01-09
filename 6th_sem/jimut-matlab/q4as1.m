% to calculate lcm and hcf of two numbers

clc;
close all;
clear all;
a=input('\n Enter 1st number(1-2000)=');
b=input('\n Enter 2st number(1-2000)=');
h=hcf1(a,b);
lc=lcm1(a,b);
fprintf('a=%d,b=%d,lcm=%d,hcf=%d\n',a,b,lc,h);