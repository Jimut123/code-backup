%  xximage2.m : Write a program to copy an image n-times along y-axis

clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('\nEnter Output Image File Name=','s');
nx=input('Enter number of times to be copied along y-axis=');
x=imread(file1);
[r,c,d]=size(x);

%to copy image along y-axis
r1=1;
for i=1:nx
    y(r1:i*r, 1:c, 1:d)=x(1:r, 1:c, 1:d);
    r1=r1+r;
end
imshow(y);
imwrite(y,file2);