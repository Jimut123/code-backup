%animage4.m: Write a program to convert any RGB image file to Black and
%White image
%image file
clc;
clear all;
close all;
file1=input('\nEnter Input Image File name=','s');
file2=input('Enter output gray scale image file name=','s');
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1)=x(1:r,1:c,1)*.2989+x(1:r,1:c,2)*.587+x(1:r,1:c,3)*.114;
for i=1:r
    for j=1:c
        if y(i,j,1)>=127
            z(i,j,1)=255;
        else
            z(i,j,1)=0;
        end
    end
end
x1=x; % Copying RGB to x1
x1(1:r,c+1:2*c,1)=y(1:r,1:c,1);
x1(1:r,c+1:2*c,2)=y(1:r,1:c,1);
x1(1:r,c+1:2*c,3)=y(1:r,1:c,1);
x1(1:r,2*c+1:3*c,1)=z(1:r,1:c,1);
x1(1:r,2*c+1:3*c,2)=z(1:r,1:c,1);
x1(1:r,2*c+1:3*c,3)=z(1:r,1:c,1);
imwrite(x1,file2);
imshow(z);
%End of program

    