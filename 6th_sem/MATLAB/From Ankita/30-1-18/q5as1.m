%q5as1.m:write a program to calculate exp(x) using your own function exp(x)
%for x=1.0 to 2.0 in step of .1
format long;
clc;
close all;
clear all;
for i=.1:.1:2
    y=expx(i);
    fprintf('\nexp(%5.1f)=%16.8f',i,y);
end