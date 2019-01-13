%q7as2.m : Write a program to input any image file. Take reflection along
%y-axis. Display final image.
clc;
close all;
clear all;
file1=input('\nEnter Input Image file name=','s');
file2=input('Enter Output Image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; %copying image pixels into y
y(1:r,c+1:2*c,1:d)=x(1:r, c:-1:1,1:d);
imshow(y);
imwrite(y,file2);
%End of program
