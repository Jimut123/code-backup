%write a program to copy an image n-times along y-axis
clc;
clear all;
close all;
file1=input('\n enter input image file name','s');
file2=input('\n enter output image file name','s');
ny=input('\n enter the number of times to be copied');
x=imread(file1);
[r,c,d]=size(x);
% to copy image along x axis
r1=1;
for i=1:ny
    y(r1:r*i,1:c,1:d)=x(1:r,1:c,1:d);
    r1=r1+r;
end
imshow(y);
imwrite(y,file2);