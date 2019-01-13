%animage12.m : Write a program to copy an image m-times along x-axis and
%n-times along y-axis
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('Enter Output Image File Name=','s');
m=input('Enter number of times you want to copy along x-axis (m)=');
n=input('Enter number of times you want to copy along y-axis (n)=');
x=imread(file1);
[r,c,d]=size(x);
% To image along x-axis
j=c;
k=2*c;
y=x;
for i=1:(m-1)
    y(1:r,j+1:k,1:d)=x(1:r,1:c,1:d);
j=j+c;
k=k+c;
end
%To copy along y-axis
j=r;
k1=2*r;
for i=1:(n-1)
    y(j+1:k1,1:(k-c),1:d)=y(1:r,1:(k-c),1:d);
j=j+r;
k1=k1+r;
end
imshow(y);
imwrite(y,file2);

