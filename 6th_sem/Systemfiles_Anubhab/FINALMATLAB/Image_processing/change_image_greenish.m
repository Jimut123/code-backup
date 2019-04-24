%animage11.m: Write a program to change the color of image to greenish
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
x=imread(file1);
[r,c,d]=size(x);
x(1:r,1:c,1)=0;
x(1:r,1:c,3)=0;
imshow(x);
imwrite(x,file2);
%End of program
