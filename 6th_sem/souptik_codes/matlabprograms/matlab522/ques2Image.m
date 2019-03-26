clc;
close all;
clear all;
x=imread('Desert.jpg');

imshow(x);
dummy=input('enter any value to proceed','s');
m=input('enter mult fact along x axis: ');
n=input('enter mult fact along y axis: ');
[r,c,d]=size(x);
x(1:r, 1:17, 1:d)=0;
x(1:r, c-17:c, 1:d)=0;
x(1:17, 1:c, 1:d)=0;
x(r-17:r, 1:c, 1:d)=0;
imshow(x);
dummy=input('enter any value to proceed','s');
c1=1;
for i=1:m
    y1(1:r, c1:i*c, 1:d)=x(1:r, 1:c, 1:d);
    c1=c1+c;
end
imshow(y1);
dummy=input('enter any value to proceed','s');
[r,c,d]=size(y1);
r1=1;
for i=1:n
    y1(r1:i*r, 1:c, 1:d)=y1(1:r, 1:c, 1:d);
    r1=r1+r;
end
imshow(y1);
imwrite(y1, 'destFileImage.jpg');
