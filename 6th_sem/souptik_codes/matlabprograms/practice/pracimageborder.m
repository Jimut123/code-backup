clc;
close all;
clear all;


img1=input('Enter Image ','s');
x=imread(img1);
[r,c,d]=size(x);

x(1:15,1:c,:)=0;
x(r-14:r,1:c,:)=0;
x(1:r,1:15,:)=0;
x(1:r,c-14:c,:)=0;
tx=3;
ty=3;
r1=1;
c1=1;
for i=1:tx
    y(1:r,c1:i*c,:)=x(1:r,1:c,:);
    c1=i*c+1;
end
[r,c,d]=size(y);
for i=1:ty
    y1(r1:i*r,1:c,:)=y(1:r,1:c,:);
    r1=i*r+1;
end
[r,c,d]=size(y1);
y1(1:30,1:c,:)=0;
y1(r-29:r,1:c,:)=0;
y1(1:r,1:30,:)=0;
y1(1:r,c-29:c,:)=0;
imshow(y1);


