%xximage1.m : Write a program to copy an image n-times along x-axis
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name = ','s');
file2=input('\nEnter Output Image File Name = ','s');
nx=input('Enter number of times image to be copied along x-axis = ');
x=imread(file1);
[r,c,d]=size(x);
%To copy image along x-axis
c1=1;
for i=1:nx
    y(1:r,c1:i*c,1:d)=x(1:r,1:c,1:d);
    c1=c1+c;
end
imshow(y);
imwrite(y,file2);
%End of program