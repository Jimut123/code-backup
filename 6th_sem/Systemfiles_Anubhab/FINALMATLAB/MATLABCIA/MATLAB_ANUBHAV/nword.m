clc;
clear all;
close all;
n=input('\nEnter decimal number: ');
str = num2words(n);
fprintf('%d in words is %s\n',n,str);