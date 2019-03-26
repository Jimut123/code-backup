clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
file2=input('\n Enter output Image File Name','s');
ny=input('Enter the number of times n along y');
nx=input('Enter the number of times n along x');
x=imread(file1);
[r,c,d]=size(x);

border(1:r+20,1:c+20,:)=zeros(r+20,c+20,3);
%x(r:r+20,c:c+20,1:d)=border(r:r+20,c:c+20,1:d);


bimage(1:20,1:20,1:3)=border(1:20,1:20,1:3);
bimage(21:r+20,21:c+20,1:d)=x(1:r,1:c,1:d);
bimage(r+21:r+40,c+21:c+40,1:3)=border(1:20,1:20,1:3);
%imshow(bimage);
[r,c,d]=size(bimage);
%imshow(x);
r1=1;
for i=1:ny
    y(r1:i*r,1:c,1:d)=bimage(1:r,1:c,1:d);
    r1=r1+r;
end
[r,c,d]=size(y);
c1=1;
for i=1:nx
    y1(1:r,c1:i*c,1:d)=y(1:r,1:c,1:d);
    c1=c1+c;
end
imshow(y1);
imwrite(y1,file2);