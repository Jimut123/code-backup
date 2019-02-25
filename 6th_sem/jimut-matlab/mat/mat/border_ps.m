% to make a photo collage using this 

file1 = input('Enter the input file name : ','s');
file2 = input('Enter the output file name : ','s');
R = input('Enter the no. of rows : ');
C = input('Enter the no. of cols : ');
x = imread(file1);
[r,c,d] = size(x);

for i=0:R
  for j=0:C
    y(i*r+1:(i+1)*r,j*c+1:(j+1)*c,1:d)=x(1:r,1:c,1:d);
    %input('lll');
    %imshow(y);
  endfor
endfor

imshow(y);
imwrite(y,file2);

