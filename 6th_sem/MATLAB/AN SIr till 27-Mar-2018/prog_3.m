%prog_3.m : Write a program to input two numbers a,b. Print a,b.
%Interchange the values of  a,b. Print a,b. Use a 3rd variable
clc;
close all;
clear all;
a=input('\nEnter a=');
b=input('\nEnter b=');
fprintf('Before interchange : a=%d b=%d\n',a,b);
c=a;
a=b;
b=c;
fprintf('After interchange : a=%d b=%d\n',a,b);
%End of program

