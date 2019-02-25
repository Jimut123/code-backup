% color emphasis on matlab == a test

file1 = input('\n Enter the image no. 1','s');
file2 = input('\n Enter the name of output file','s');

x = imread(file1);
[r,c,d] = size(x)

for i=1:r
  for j=1:c
    
    if(x(i,j,1)>=127)
      y(i,j,1) = 255;
      fprintf("%d ",x(i,j,1));
    endif
    if(x(i,j,2)>=127)

      y(i,j,2) = 255;

      fprintf("%d ",x(i,j,2));
    endif
    if(x(i,j,3)>=127)

      y(i,j,3) = 255;
      fprintf("%d ",x(i,j,1));
    endif
    %if(x(i,j,2)>=127)
    %  y(i,j,1) = 255;
    %endif
    %if(x(i,j,3)>=127)
    %  y(i,j,1) = 255;
    %endif
  endfor
  fprintf("\n");
endfor
imwrite(y,file2);
imshow(y);

