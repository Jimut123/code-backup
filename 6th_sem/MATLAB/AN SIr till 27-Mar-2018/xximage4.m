%Problem-4: xximage4.m: Write a program to split an image into 2 images.
%Split along y-axis
clc;
clear all;
close all;
file1=input('\nEnter input Image file name=','s');
file2=input('Enter output image-1 file name=','s');
file3=input('Enter output image-2 file name=','s');
x=imread(file1);
[r,c,d]=size(x);
r1=fix(r/2);
y1(1:r1,1:c,1:d)=x(1:r1,1:c,1:d); % copying upper half of the image
y2(1:r-r1,1:c,1:d)=x(r1+1:r,1:c,1:d); % copying lower half of the image
imwrite(y1,file2);
imwrite(y2,file3);
imshow(y1);
%end of program