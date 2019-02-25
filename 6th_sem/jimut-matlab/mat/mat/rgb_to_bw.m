% To convert an image from RGB to Black and white
file1 = input('\n Enter an image file name : ','s');
file2 = input('\n Enter an output file name : ','s');
x = imread(file1);
[r,c,d] = size(x);

% converting it to grayscale;
y(1:r,1:c,1) = 0.3*x(1:r,1:c,1) + 0.6*x(1:r,1:c,2) + 0.1*x(1:r,1:c,3);

for i=1:r
  for j=1:c
    %y(i,j,1)
    if y(i,j,1) >= 127
      k(i,j,1) = 255;
    else
      k(i,j,1) = 0;
    endif
  endfor
endfor

imshow(k);
imwrite(k,file2);
