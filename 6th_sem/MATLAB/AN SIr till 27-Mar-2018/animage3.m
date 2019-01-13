%animage3.m: Write a program to convert any RGB image file to gray scale
%image file
clc;
clear all;
close all;
file1=input('\nEnter Input Image File name=','s');
file2=input('Enter output gray scale image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1)=x(1:r,1:c,1)*.2989+x(1:r,1:c,2)*.587+x(1:r,1:c,3)*.114;
imwrite(y,file2);
imshow(y);
%End of program

    