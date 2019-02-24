% reflect image along x-axis
file1 = input('\n Enter the input file name : ','s');
file2 = input('\n Enter the output file name : ','s');

x = imread(file1);
[r,c,d] = size(x);
y=x;
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d);
imwrite(y,file2);
imshow(y);

