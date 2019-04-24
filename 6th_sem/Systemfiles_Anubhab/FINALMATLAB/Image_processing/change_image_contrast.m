
%animage12.m: Write a program to change contrast of the an image
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
x=fix(1.5*x);
imshow(x);
imwrite(x,file2);
%End of program
