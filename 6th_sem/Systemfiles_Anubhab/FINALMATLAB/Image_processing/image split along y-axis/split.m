%image_proc_2.m : Write a program to split 1 image to 2 images. Split along
%y-axis

clc;
clear all;
close all;
file1=input('\nEnter Input Image file name = ','s');
file2=input('Enter Output Image File-1 name = ','s');
file3=input('Enter Output Image File-2 name = ','s');
x=imread(file1);
[r,c,d]=size(x);
c1=fix(c/2);
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d); %copying 50% pixels y-axis wise
y2(1:r,1:c-c1,1:d)=x(1:r,c1+1:c,1:d); %copying rest 50% pixels y-axis wise
imwrite(y1,file2);
imwrite(y2,file3);
imshow(y1);
%end