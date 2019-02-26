% To get the stats of an image using pixel data!
% Author =  Jimut Bahan Pal


clc;
clear all;
close all;

file1 = input('Enter the input file name : ','s');
x = imread(file1);

[r,c,d]=size(x);
fprintf('DIM :=> r = %d, c = %d, d = %d \n',r,c,d);
fprintf('\n CALCULATING WAIT \n');
R = [];
G = [];
B = [];
% Since 0 is not an array index, so this is 1 to 256 , just shifted 1.
for i=1:256
    R(i)=0;
    G(i)=0;
    B(i)=0;
endfor

for i=1:r
  for j=1:c
    % for R = x(i,j,1)
    % for G = x(i,j,2)
    % for B = x(i,j,3)
    R(x(i,j,1)+1) = R(x(i,j,1)+1)+1;
    G(x(i,j,2)+1) = G(x(i,j,2)+1)+1;
    B(x(i,j,3)+1) = B(x(i,j,3)+1)+1;
  endfor
endfor

R_sum = sum(R);
G_sum = sum(G);
B_sum = sum(B);

for i=1:256
  fprintf('R(%d) = %2.4f per, G(%d) = %2.4f per, B(%d) = %2.4f per \n',(i-1),(R(i)/R_sum)*100,(i-1),(G(i)/G_sum)*100,(i-1),(B(i)/B_sum)*100);
endfor
