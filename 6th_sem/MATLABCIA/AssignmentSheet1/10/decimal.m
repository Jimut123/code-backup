clc;
clear all;
close all;
n=input('\nEnter decimal number: ');
b=input('\nEnter base : ');
str = dec2base(n,b);
fprintf('%d in base %d is %s\n',n,b,str);