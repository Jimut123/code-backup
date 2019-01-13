%Problem-5: xximage5.m: Write a program to split an image into 2 images.
%Split along x-axis
clc;
clear all;
close all;
file1=input('\nEnter input Image file name=','s');
file2=input('Enter output image-1 file name=','s');
file3=input('Enter output image-2 file name=','s');
x=imread(file1);
[r,c,d]=size(x);
c1=fix(c/2);
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d); % copying left half of the image
y2(1:r,1:c-c1,1:d)=x(1:r,c1+1:c,1:d); % copying right half of the image
imwrite(y1,file2);
imwrite(y2,file3);
imshow(y1);
%end of program