clc;
clear all;
close all;

image1=input('Enter image file 1 name','s');
x=imread(image1);
[r,c,d]=size(x);


%border%

x(1:15,1:c,1:d)=0;
x(r-14:r,1:c,1:d)=0;
x(1:r,1:15,1:d)=0;
x(1:r,c-14:c,1:d)=0;
[r,c,d]=size(x);
ny=5;
nx=5;
r1=1;
for i=1:ny
    y(r1:i*r,1:c,1:d)=x(1:r,1:c,1:d);
    r1=r1+r;
end
imshow(y);
c1=1;
for i=1:nx
    y1(1:r,c1:i*c,1:d)=y(1:r,1:c,1:d);
    c1=c1+r;
end
imshow(y1);