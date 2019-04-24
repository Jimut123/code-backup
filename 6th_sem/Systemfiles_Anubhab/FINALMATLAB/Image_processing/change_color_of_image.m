%xximage14.m: Write a program to change color of an image file
clc;
close all;
clear all;
file1=input('\nEnter input image file name=','s');
redf=input('Enter red color image file=','s');
greenf=input('Enter green color image file=','s');
bluef=input('Enter blue color image file=','s');
x=imread(file1);
[r,c,d]=size(x);
r1(1:r,1:c,1)=x(1:r,1:c,1);
r1(1:r,1:c,2:3)=0;
imshow(r1);
imwrite(r1,redf);
choice=input('\nPress enter key--->','s');
g1(1:r,1:c,2)=x(1:r,1:c,2);
g1(1:r,1:c,1:2:3)=0;
imshow(g1);
imwrite(g1,greenf);
choice=input('\nPress enter key--->','s');

b1(1:r,1:c,3)=x(1:r,1:c,3);
b1(1:r,1:c,1:2)=0;
imshow(b1);
imwrite(b1,bluef);
%End of program