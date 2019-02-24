%to display an image on screen
clc;
close all;
file1 = input('\n Enter the input image file name = ','s');
file2 = input('\n Enter the output image file name = ','s');
x=imread(file1);
[r,c,d]=size(x);
fprintf('r = %d c = %d d = %d \n',r,c,d);
imshow(x); 
imwrite(x,file2);