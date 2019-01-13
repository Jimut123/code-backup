%rung4_main.m : Write main program to access rung4 function
clc;
clear all;
close all;
x0=input('\nEnter x0=');
y0=input('Enter y0=');
xn=input('Enter xn=');
h=input('Enter h=');
n=fix((xn-x0)/h);
x(1)=x0;
y(1)=y0;
for i=2:n+1
    x(i)=x0+h;
    y1=runge4(x0,y0,h);
    y(i)=y1;
    x0=x(i);
    y0=y1;
end
for i=1:n+1
    fprintf('x(%d)=%5.1f y(%d)=%7.5f\n',i,x(i),i,y(i));
end

plot(y,'bo-');
%end of main
