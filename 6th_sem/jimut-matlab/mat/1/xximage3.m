% xximage3.m : Copy an image along x-axis (nx-times), along y-axis(ny-times)

clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('\nEnter Output Image File Name=','s');
nx=input('Enter number of times to copied along x-axis=');
ny=input('Enter number of times to copied along y-axis=');
src=imread(file1);
[r,c,d]=size(src);

%to copy image along x-axis
c1=1;
for i=1:nx;
    src_x(1:r, c1:i*c, 1:d)=src(1:r, 1:c, 1:d);
    c1=c1+c;
end

%to copy image along y-axis
r1=1;
for i=1:ny;
    src_x_y(r1:i*r, 1:c*nx, 1:d)=src_x(1:r, 1:c*nx, 1:d);
    r1=r1+r;
end

%writing the image to the output file
imshow(src_x_y);
imwrite(src_x_y,file2);