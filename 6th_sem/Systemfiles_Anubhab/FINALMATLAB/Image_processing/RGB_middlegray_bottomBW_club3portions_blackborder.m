
%q1as4.m : Write a program in MATLAB to split a RGB image to 3 equal parts.
%Chanege the color of middle portion to Gray scale and the bottom portion
%to B/W. Club 3 portions and then add Black border in the clubbed image.
%Display modified image and save the modified image to some output file.
clc;
close all;
clear all;
file1=input('\nEnter Input RGB image File name=','s');
file2=input('Enter out  image File name=','s');
x=imread(file1);
[r,c,d]=size(x);
r1=fix(r/3);
r2=r-2*r1;
% To extract 3 portions of input image
y1(1:r1,1:c,1:d)=x(1:r1,1:c,1:d); % 1/3rd portion of image
y2(1:r1,1:c,1:d)=x(r1+1:2*r1,1:c,1:d); % 2nd 1/3rd portion of image
y3(1:r2,1:c,1:d)=x(2*r1+1:r,1:c,1:d); % last 1/3rd portion of image

% To convert 2nd and 3rd portion of the image to gray scale
y2g(1:r1,1:c,1)=.2987*y2(1:r1,1:c,1)+.587*y2(1:r1,1:c,2)+.114*y2(1:r1,1:c,3);
y3g(1:r2,1:c,1)=.2987*y3(1:r2,1:c,1)+.587*y3(1:r2,1:c,2)+.114*y3(1:r2,1:c,3);

%To convert 3rd portion of the image to B/W
    for i=1:r2
        for j=1:c
            if y3g(i,j,1) >=127
                y3b(i,j,1)=255;
            else
                y3b(i,j,1)=0;
            end
        end
    end
    
    %To club 3 portions of the image
    yfinal=y1; % To copy y1 to yfinal
    % To copy y2g to yfinal
    yfinal(r1+1:2*r1,1:c,1)=y2g(1:r1,1:c,1);
    yfinal(r1+1:2*r1,1:c,2)=y2g(1:r1,1:c,1);
    yfinal(r1+1:2*r1,1:c,3)=y2g(1:r1,1:c,1);
    %To copy y3b to yfinal
    yfinal(2*r1+1:r,1:c,1)=y3b(1:r2,1:c,1);
    yfinal(2*r1+1:r,1:c,2)=y3b(1:r2,1:c,1);
    yfinal(2*r1+1:r,1:c,3)=y3b(1:r2,1:c,1);
    
    
    % To copy modified image to yf without border
    yf(11:r+10,11:c+10,1:d)=yfinal(1:r,1:c,1:d);
    
    % To add border on top position
    for i=1:3
    yf(1:10,1:c+20,1:i)=0;
    end
    % To add boder on bottom position
    for i=1:3
        yf(r+11:r+20,1:c+20,i)=0;
    end
    %To add border on LHS
    for i=1:3
        yf(11:r+10,1:10,i)=0;
    end
    %To add border on RHS
    for i=1:3
        yf(11:r+10,c+11:c+20,i)=0;
    end
    imshow(yf); % To display modified image with border
    imwrite(yf,file2); % To save modified image with border.
%End of program
