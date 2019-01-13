%q11as1.m: Write a main program to calculate
% product = 1  * 2 * 3 * 4 * ... * n
close all;
clear all;
n = input('\nEnter n(1-10): ');
y = product4(n);
fprintf('\nSum Of %d numbers: %d\n', n, y);
%End of main module