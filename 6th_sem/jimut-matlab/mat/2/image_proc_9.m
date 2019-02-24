%image_proc_9.m : Write a program to convert any RGB image to Gray scale
%image and then change the gray scale to B/W image

clc;
clear all;
close all
file1 = input('\nEnter Input Image file name=','s');
file2 = input('Enter Output Image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
g(1:r, 1:c, 1)= 0.2989*x(1:r, 1:c, 1) + .587*x(1:r, 1:c, 2) + .1114*x(1:r, 1:c, 3);
for i=1:r
    for j=1:c
        if g(i,j,1)>=127
            