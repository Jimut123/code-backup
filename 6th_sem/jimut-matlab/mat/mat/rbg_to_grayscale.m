file1 = input('\n Enter the input file name : ','s');
file2 = input('\n Enter the output file name : ','s');
x = imread(file1);
[r,c,d] = size(x);
% Jimut's RBG value :
%y(1:r,1:c,1) = (x(1:r,1:c,1) + x(1:r,1:c,2) + x(1:r,1:c,3))/3;

% AN's RBG value :
y(1:r,1:c,1) = 0.3*x(1:r,1:c,1) + 0.6*x(1:r,1:c,2) + 0.1*x(1:r,1:c,3);
imshow(y);
imwrite(y,file2);


