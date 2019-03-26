%write a program to copy an image n-times along x-axis
clc;
clear all;
close all;
file1=input('\n enter input image file name','s');
file2=input('\n enter output image file name','s');
nx=input('\n enter the number of times to be copied');
x=imread(file1);
[r,c,d]=size(x);
% to copy image along x axis
c1=1;
for i=1:nx
    y(1:r,c1:i*c,1:d)=x(1:r,1:c,1:d);
    c1=c1+c;
end
imshow(y);
imwrite(y,file2);

