%q11as1.m: Write a main program to calculate
% s = n + (n - 2) + ... upto 1 or 2 (denpending on odd or even)
close all;
clear all;
n = input('\nEnter n(1-10): ');
y = sum3(n);
fprintf('\nSum Of %d numbers: %d\n', n, y);
%End of main module