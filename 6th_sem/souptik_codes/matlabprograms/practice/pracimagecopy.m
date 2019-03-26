clc;
close all;
clear all;


img1=input('Enter Image ','s');
x=imread(img1);
[r,c,d]=size(x);

tx=5;
ty=6;
r1=1;
c1=1;
for i=1:tx
    y(1:r,c1:i*c,:)=x(1:r,1:c,:);
    c1=i*c+1;
end
[r,c,d]=size(y);
for j=1:ty
    y(r1:j*r,1:c,:)=y(1:r,1:c,:);
    r1=j*r+1;
end
imshow(y);