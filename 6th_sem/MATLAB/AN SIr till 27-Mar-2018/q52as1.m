%q52as1.m : Write a program to calculate sin(x),cos(x),tan(x) using your
%own function
clc;
close all;
clear all;
format long;
for x=0:5:360
    y1=sine(x);
    y2=cosine(x);
    y3=tangent(x);
fprintf('x=%5.1f sin(x)=%12.8f cos(x)=%12.8f tan(x)=%16.5f\n',x,y1,y2,y3);
end
%End of main program
