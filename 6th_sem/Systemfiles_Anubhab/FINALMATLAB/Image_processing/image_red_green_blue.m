%image9.m: Write a program to input an image and then change the color
% of the image red or green or blue depending on user's choice
clc;
close all;
clear all;
file1=input('\nEnter your input image file name=','s');
file2=input('Enter your Output image file name=','s');
n=input('Enter 1 for red 2 for green and 3 for blue color=');
x=imread(file1);
[r,c,d]=size(x);
if n==1
    y(1:r,1:c,1)=x(1:r,1:c,1);
    y(1:r,1:c,2:d)=0;
elseif n==2
        y(1:r,1:c,2)=x(1:r,1:c,2);
        y(1:r,1:c,1:2:3)=0;
else
    y(1:r,1:c,3)=x(1:r,1:c,3);
    y(1:r,1:c,1:2)=0;
end
imshow(y);
imwrite(y,file2);
%end of program