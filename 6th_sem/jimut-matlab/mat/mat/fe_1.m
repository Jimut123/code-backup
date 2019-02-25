% color emphasis on matlab == a test
clear all;
clc;
close all;
file1 = input('\n Enter the image no. 1','s');
file2 = input('\n Enter the name of output file','s');

x = imread(file1);
[r,c,d] = size(x)

for i=1:r
  for j=1:c
    if(x(i,j,2)>=0&&x(i,j,2)<=20)
      y(i,j,1) = x(i,j,2);
      y(i,j,2) = x(i,j,2);
      y(i,j,3) = x(i,j,2);
      fprintf("%d ",x(i,j,2));
    endif
    
  endfor
  fprintf("\n");
endfor
imwrite(y,file2);
imshow(y);
