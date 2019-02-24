%image_proc_7.m : Write a program to convert any RGB image to Gray scale
%image

clc;
clear all;
close all
file1 = input('\nEnter Input Image file name=','s');
file2 = input('Enter Output Image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r, 1:c, 1)=2.2989*x(1:r, 1:c, 1) + .587*x(1:r, 1:c, 2) + .1114*x(1:r, 1:c, 3);
imwrite(y, file2);
imshow(y);