%xximage9.m:Write a program to copy image along x-axis and along y-axis
%m-times,n-times respectively.Display modified image
clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('\nEnter output Image File name=','s');
m=input('Enter how many times you want to copy along x-axis(m)=');
n=input('Enter how many times you want to copy along y-axis(n)=');
x=imread(file1);
[r,c,d]=size(x);
y=x;%copying x-pixels to y
%To copy pixels along x-axis
j=c+1;
k=2*c;
for i=1:m-1
    y(1:r,j+5:k+5,1:d)=y(1:r,1:c,1:d);
    for i=0:4
    y(1:r,j+i,d)=255;
    end
    j=j+c;
    k=k+c;
end
%to copy along y-axis
j=r+1;
k1=2*r;
for i=1:n-1
    y(j:k1,1:(k-c),1:d)=y(1:r,1:(k-c),1:d);
    j=j+r;
    k1=k1+r;
end
imshow(y);
imwrite(y,file2);