%image_mixing_2.m : Write a program in Matlab to mix two image files
clc;
close all;
clear all;
file1=input('\nEnter Input Image File-1 Name = ','s');
file2=input('\nEnter Input Image File-2 Name = ','s');
file3=input('\nEnter Output Image File Name = ','s');
x1=imread(file1);
[r1,c1,d1]=size(x1);
x2=imread(file2);
[r2,c2,d2]=size(x2);
fprintf('r1 = %d c1 = %d d1 = %d r2 = %d c2 = %d d2 = %d\n',r1,c1,d1,r2,c2,d2);
choice=input('Press enter key--->','s');
if r1<r2
    r=r1;
else
    r=r2;
end
if c1<c2
    c=c1;
else
    c=c2;
end
x(1:r,1:c,1:3)=.5*(1.5*x1(1:r,1:c,1:3)+x2(1:r,1:c,1:3));
imshow(x);
imwrite(x,file3);
