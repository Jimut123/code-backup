%animage9.m: Write a program to copy an image along y-axis n-times.
clc;
close all;
clear all;
file1=input('\nEnter Input Image File name=','s');
file2=input('Enter Output Image File name=','s');
n=input('Enter how many times you want to copy along y-axis wise=');
x=imread(file1);
[r,c,d]=size(x);
y=x;%To copy x to y
j=r;
k=j+r;
for i=2:n
    y(j+1:k,1:c,1:d)=x(1:r,1:c,1:d);
    j=j+r;
    k=k+r;
end
imshow(y);
imwrite(y,file2);
%End of program