%image_proc_8.m : Write a program to convert any RGB image to Gray scale
%image and then print both side by side

clc;
clear all;
close all
file1 = input('\nEnter Input Image file name=','s');
file2 = input('Enter Output Image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y=x; % copying RGB to y
%y(1:r, c+1:2*c, 1)=0.2989*x(1:r, 1:c, 1) + .587*x(1:r, 1:c, 2) + .1114*x(1:r, 1:c, 3);

g(1:r, c+1:2*c, 1)=0.2989*x(1:r, 1:c, 1) + .587*x(1:r, 1:c, 2) + .1114*x(1:r, 1:c, 3);

y(1:r, c+1:2*c, 1)=g(1:r, 1:c, 1);
y(1:r, c+1:2*c, 2)=g(1:r, 1:c, 1);
y(1:r, c+1:2*c, 3)=g(1:r, 1:c, 1);

imwrite(y, file2);
imshow(y);