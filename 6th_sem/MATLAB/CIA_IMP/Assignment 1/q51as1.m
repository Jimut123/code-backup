%q51as1.m : Write a program to calculate exp(x) using your own function
%expx(x) for x=.1 to 2.0 in step of .1
clc;
close all;
clear all;
for i=.1:.1:2
    y=expx(i);
    fprintf('exp(%5.1f)=%16.13f\n',i,y);
end
%End of main program