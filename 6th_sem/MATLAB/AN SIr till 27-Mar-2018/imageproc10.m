%imageproc10.m: Write a program to mix two images.
clc;
close all;
clear all;
file1=input('\nEnter Input Image File-1 name=','s');
file2=input('Enter Input Image File-2 name=','s');
file3=input('Enter Output Image File name=','s');
x=imread(file1);
y=imread(file2);
[r1,c1,d1]=size(x);
[r2,c2,d2]=size(y);
fprintf('r1=%d c1=%d d1=%d r2=%d c2=%d d2=%d\n',r1,c1,d1,r2,c2,d2);
if r1<r2
    r=r1;
else
    r=r2;
end
if c1<c2
    c=c1;
else
    c=c2;
end
%Copying alternately pixels from 2 images
    for i=1:r
        for j=1:c
            ij=i+j;
            if mod(ij,2)==0
                z(i,j,1:3)=x(i,j,1:3);
            else
                z(i,j,1:3)=y(i,j,1:3);
            end
        end
    end
    imshow(z);
    imwrite(z,file3);
    %End of program
    
