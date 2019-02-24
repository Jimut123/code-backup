% reflect image along x-axis
file1 = input('\n Enter the input file name : ','s');
file2 = input('\n Enter the output file name : ','s');

x = imread(file1);
[r,c,d] = size(x);
y=x;
y(1:r,)
imwrite(y,file2);
imshow(y);

