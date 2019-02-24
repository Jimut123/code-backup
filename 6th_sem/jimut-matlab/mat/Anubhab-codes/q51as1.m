%q51as1.m:Write a program to obtain exp(x) from x=0 to 2 in step of .1.
%Use your own function to calculate exp(x)
clc;
clear all;
close all;
for x=0:.1:2
    y=expx(x);
    fprintf('exp(%5.1f)=%16.12f\n',x,y);
end
%end of program