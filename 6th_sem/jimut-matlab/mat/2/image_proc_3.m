%image_proc_3.m : Write a program to split to 2 images. Split along
%X-axis.

clc;
clear all;
close all;
file1=input('\nEnter Input Image file name=','s');
file2=input('Enter Output Image File-1 name=','s');
file3=input('Enter Output Image File-2 name=','s');
y=imread(file1);
[r,c,d]=size(y);
r1=fix(r/2);
x1(1:r1, 1:c, 1:d)=y(1:r1, 1:c, 1:d); % copying 50% pixels x-axis wise
x2(1:r-r1, 1:c, 1:d)=y(r1+1:r, 1:c, 1:d); % copying rest 50% pixel x-axis wise
imwrite(x1, file2);
imwrite(x2, file3);
imshow(x1);