file1 = input('\nEnter the image file name for input : ','s');
file2 = input('\nEnter the image file name for output : ','s');
x = imread(file1);
[r,c,d] = size(x);
y=x;
%d:-1:1 may cause the image to go GBR instead of RBG so may change the color of the image
%y(r+1:2*r,1:c,1:d)=x(r:-1:1,c:-1:1,d:-1:1);  
y(r+1:2*r,1:c,1:d)=x(r:-1:1,1:c,1:d);
%y(1:r,c+1:2*c,1:d)=x(r:-1:1,c:-1:1,d:-1:1);

z=y;
z(1:2*r,c+1:2*c,1:d)=y(1:2*r,c:-1:1,1:d);
imwrite(z,file2);
imshow(z);


