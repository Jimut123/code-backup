file1 = input('\n Enter the input file name : ','s');
file2 = input('\n Enter the output file name [1] : ','s');
file3 = input('\n Enter the output file name [2] : ','s');
x = imread(file1);
[r,c,d] = size(x);
r1 = fix(r/2);

x1(1:r1,1:c,1:d) = x(1:r1,1:c,1:d);
x2(1:r-r1,1:c,1:d) = x(r1+1:r,1:c,1:d);
imwrite(x1,file2);
imwrite(x2,file3);
imshow(x1);
imshow(x2);