%image_proc_9.m : Write a program to convert any RGB to gray scale image
%Fix gray scale image on RHS of RGB image
clc;
clear all;
close all;
file1=input('\nEnter Input Image File Name = ','s');
file2=input('Enter Output Image File Name = ','s');
x=imread(file1);
[r,c,d]=size(x);
g(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.114*x(1:r,1:c,3);
for i=1:r
    for j=1:c
        if g(i,j,1)>=127
            y(i,j,1)=255;
        else
            y(i,j,1)=0;
        end
    end
end
imwrite(y,file2);
imshow(y);
%end