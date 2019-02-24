file1 = input('\n Enter the input file name : ','s');
file2 = input('\n Enter the output file name [1] : ','s');
file3 = input('\n Enter the output file name [2] : ','s');
x = imread(file1);
[r,c,d] = size(x);
c1 = fix(c/2);

y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d);   %copying 50% pixels y-axis wise
y2(1:r,1:c-c1,1:d)=x(1:r,c1+1:c,1:d);   %copying 50% pixels y-axis wise
imwrite(y1,file2);
imwrite(y2,file3);
imshow(y1);
imshow(y2);