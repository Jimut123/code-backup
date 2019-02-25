% color emphasis on matlab == a test

file1 = input('\n Enter the image no. 1','s');
file2 = input('\n Enter the name of output file','s');

x = imread(file1);
[r,c,d] = size(x)

for i=1:r
  for j=1:c
    if(x(i,j,1)>=0&&x(i,j,1)<=10)
      y(i,j,1) = x(i,j,1);
      y(i,j,2) = x(i,j,1);
      y(i,j,3) = x(i,j,1);
      fprintf("%d ",x(i,j,1));
    else
      y(i,j,1) = 0;
      y(i,j,2) = 0;
      y(i,j,3) = 0;
    endif
    
  endfor
  fprintf("\n");
endfor
imwrite(y,file2);
imshow(y);
