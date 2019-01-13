%q11as2.m : Write a program to copy an image 'n' times along x-axis and 'm'
%times along y-axis
clc;
close all;
clear all;
file1=input('\nEnter Input Inage File Name=','s');
file2=input('Enter Output Image File Name=','s');
n=input('Enter how many times you want to copy along x-axis=');
m=input('Enter how many times you want to copy along y-axis=');

x=imread(file1);
[r,c,d]=size(x);
y=x; %Copying x-pixels to y
j=1;
k=c;
    for i=1:(n-1)
        j=j+c;
        k=k+c;
        y(1:r,j:k,1:d)=y(1:r,1:c,1:d);
    end
  % Copying along y-axis
  [r,c,d]=size(y);
  j=1;
  k=r;
        for i=1:(m-1)
            j=j+r;
            k=k+r;
            y(j:k,1:c,1:d)=y(1:r,1:c,1:d);
        end
    imshow(y);
    imwrite(y,file2);
    %End of program
