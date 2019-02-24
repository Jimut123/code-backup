%image_proc_6.m : Write a program to take an image along x-axis and then
%along y-axis

clc;
clear all;
close all;
file1=input('\nEnter Input Image file name=','s');
file2=input('Enter Output Image name=','s');
image=imread(file1);
[r,c,d]=size(image);
image_x=image; %copying image to output image
image_x(r+1:2*r, 1:c, 1:d)=image(r:-1:1, 1:c, 1:d); %taking reflection along x-axis
image_x_y = image_x;
image_x_y(1:2*r, c+1:2*c, 1:d) = image_x(1:2*r, )
