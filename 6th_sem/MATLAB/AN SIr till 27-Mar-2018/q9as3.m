%q9as3.m : Write a program to solve differential equation using 4-th order
%Runge Kutta method
clc;
close all;
clear all;
x0=input('\nEnter x0=');
y0=input('Enter y0=');
xn=input('Enter xn=');
n=input('Enter number of Intervals=');
x(1)=x0;
y(1)=y0;
fprintf('x=%7.2f y=%8.5f\n',x(1),y(1));
x1=x0;
y1=y0;
j=1;
h=(xn-x0)/n;
for i=1:n
    y1=runge4(x1,y1,h);
    x1=x0+i*h;
    j=j+1;
    x(j)=x1;
    y(j)=y1;
end
for i=1:n+1
    fprintf('x=%7.2f y=%8.5f\n',x(i),y(i));
end
plot(x,y);
%end of program
