%xximage5.m:Write a program to split an image into 2 images.
%Split along x-axis
clc;
clear all;
close all;
file1=input('\nEnter your input file name=','s');
file2=input('\nEnter your output image-1 file name=','s');
file3=input('\nEnter your output image-2 file name=','s');
x=imread(file1);
[r,c,d]=size(x);
c1=fix(c/2);
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d);%coping left half of image
y2(1:r,1:c1,1:d)=x(1:r,c1+1:c,1:d);%coping right half of image
imwrite(y1,file2);
imwrite(y2,file3);
imshow(y1);