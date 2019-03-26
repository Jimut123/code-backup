clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
file2=input('\n Enter output Image File Name','s');
ny=input('Enter the number of times n');
x=imread(file1);
[r,c,d]=size(x);

r1=1;
for i=1:ny
    y(r1:i*r,1:c,1:d)=x(1:r,1:c,1:d);
    r1=r1+r;
end
imshow(y);
imwrite(y,file2);
