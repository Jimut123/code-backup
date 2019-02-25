% To add custom images based on the width of the collage
continue_var = 1;
NEXT_VAR = 3;   %width of the collage!
CUR_VAR = 0;
ROW_VAR = 0;

while continue_var~=0
  get_img = input('Enter the image name : ','s');
  x = imread(get_img);
  [r,c,d] = size(x);
  fprintf('\n Dimensions of image %s is r = %d c = %d d = %d : ',get_img,r,c,d);
  continue_var = input('Press 1 to continue : ');
  if d == 3
    if CUR_VAR == 0
      y=x;
      CUR_VAR = CUR_VAR + 1;
    else
      close all;
      fprintf("Adding Image Please wait : ");
      y((ROW_VAR*r)+1:(ROW_VAR+1)*r,c*CUR_VAR+1:(CUR_VAR+1)*c,1:d) = x(1:r,1:c,1:d);
      CUR_VAR = CUR_VAR+1;
    endif
    if mod(CUR_VAR,NEXT_VAR)==0
      CUR_VAR = 0;
      ROW_VAR = ROW_VAR + 1;
    endif
    imshow(y);
  else
    fprintf('SKIPPING D = 3');
  endif
endwhile

imwrite(y,"big_image.jpg");
