% xximage4.m : Copy an image along x-axis (nx-times), along y-axis(ny-times)
% Also add a border to the final image

clc;
close all;
clear all;
file1=input('\nEnter Input Image File Name=','s');
file2=input('\nEnter Output Image File Name=','s');
nx=input('Enter number of times to copied along x-axis=');
ny=input('Enter number of times to copied along y-axis=');
b=input('Enter the border width=');
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

%adding border to the final image
src_x_y_b(1:r*ny+b, 1:b, 1:d)=0; %left border
src_x_y_b(1:b, 1:c*nx+b, 1:d)=0; %top border
src_x_y_b(1+b:r*ny+b, 1+b:c*nx+b, 1:d)=src_x_y(1:r*ny, 1:c*nx, 1:d); %the image
src_x_y_b(1:r*ny+b, c*nx+b:c*nx+2*b, 1:d)=0; %right border
src_x_y_b(r*ny+b:r*ny+2*b, 1:c*nx+2*b, 1:d)=0; %bottom border

%writing the image to the output file
imshow(src_x_y_b);
imwrite(src_x_y_b,file2);