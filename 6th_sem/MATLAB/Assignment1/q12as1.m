%q11as1.m: Write a main program to calculate s = 1^2 + (1^2+2^2) +
%(1^2+2^2+3^2)+...+(1^2+2^2+...+n^2)
clc;
close all;
clear all;
n = input('\nEnter n(1-10): ');
y = sum2(n);
fprintf('\nSum Of %d numbers: %d\n', n, y);
%End of main module