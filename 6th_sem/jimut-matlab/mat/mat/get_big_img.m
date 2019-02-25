im_fn = 'jim_223.jpg';
x = imread(im_fn);
[r,c,d] = size(x);
y=x;
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim_bw.jpg';
x = imread(im_fn);
y(1:r,c+1:2*c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim_fe_1.jpg';
x = imread(im_fn);
y(1:r,2*c+1:3*c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim_rbg_kb.jpg';
x = imread(im_fn);
y(1:r,3*c+1:4*c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim_ttfe.jpg';
x = imread(im_fn);
y(r+1:2*r,1:c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jjj_fe2.jpg';
x = imread(im_fn);
y(r+1:2*r,c+1:2*c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim_feee.jpg';
x = imread(im_fn);
y(r+1:2*r,2*c+1:3*c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim.jpg';
x = imread(im_fn);
y(r+1:2*r,3*c+1:4*c,1:d) = x(1:r,1:c,1:d);
%imshow(y);
%input('Enter any key !','s');

im_fn = 'jim_test_f.jpg';
x = imread(im_fn);
y(2*r+1:3*r,1:c,1:d) = x(1:r,1:c,1:d);
imshow(y);
input('Enter any key !','s');
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
im_fn = '';
