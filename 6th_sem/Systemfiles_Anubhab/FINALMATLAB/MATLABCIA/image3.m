clc;
close all;
clear all;
file1=input('\nEnter Input RGB image File name=','s');
file2=input('Enter out  image File name=','s');
x=imread(file1);
[r,c,d]=size(x);
c1=fix(c/2);
%c2=c-2*c1;
% To extract 3 portions of input image
y1(1:r,1:c1,1:d)=x(1:r,1:c1,1:d); 
y2(1:r,1:c1,1:d)=x(1:r,c1+1:2*c1,1:d); 
%y3(1:r,1:c2,1:d)=x(1:r,2*c1+1:c,1:d); 

% To convert 2nd and 3rd portion of the image to gray scale
y2g(1:r,1:c1,1)=.2987*y2(1:r,1:c1,1)+.587*y2(1:r,1:c1,2)+.114*y2(1:r,1:c1,3);


%To convert 3rd portion of the image to B/W
    for i=1:r
        for j=1:c1
            if y2g(i,j,1) >=127
                y2b(i,j,1)=255;
            else
                y2b(i,j,1)=0;
            end
        end
    end
    
    %To club 3 portions of the image
    yfinal=y1; % To copy y1 to yfinal
    % To copy y2g to yfinal
    yfinal(1:r,c1+1:2*c1,1)=y2b(1:r,1:c1,1);
    yfinal(1:r,c1+1:2*c1,2)=y2b(1:r,1:c1,1);
    yfinal(1:r,c1+1:2*c1,3)=y2b(1:r,1:c1,1);
    imwrite(yfinal,file2);
    imshow(yfinal);