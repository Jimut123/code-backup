%animage1.m : Write a program to split 1 image file to two output image
%files
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter output File-1 Name=','s');
file3=input('Enter output File-2 Name=','s');
x=imread(file1);
[r,c,d]=size(x);
r1=fix(r/2);
y1(1:r1,1:c,1:d)=x(1:r1,1:c,1:d);
y2(1:(r-r1),1:c,1:d)=x(r1+1:r,1:c,1:d);
imwrite(y1,file2);
imwrite(y2,file3);
%End of program
