% b. Zooming and Shrinking
% Shrinking
clc;
clear all;
close all;
A=imread('Koala.jpg');
s=size(A);
% Zooming
        
f1=input('Enter the factor by which the image is to be Zoomed: ');
s2=s*f1;
k=1;
l=1;
for (i=1:f1:s2)
    for( j=1:f1:s2)
        C(i,j)= A(k,l);
        l=l+1;
    end
    l=1;
    k=k+1;
end
for (i=1:f1:s2)
    for (j=2:f1:s2-1)
        C(i,j)= [C(i,j-1)+ C(i, j+1)]*0.5;
    end
end
for(j=1:f1:s2)
    for(i=2:f1:s2-1)
        C(i,j)=[C(i-1,j)+C(i+1,j)]*0.5;
    end
end
for (i=2:f1:s2-1)
    for (j=2:f1:s2-1)
        C(i,j)= [C(i,j-1)+ C(i, j+1)]*0.5;
    end
end
figure,imshow(C)
title('Zoomed Image')