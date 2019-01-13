%animage21.m : Write a program  to input any image file and then multiply
%row my nx and column by ny. Display modified image on screen
clc;
close all;
clear all;
file1=input('\nEnter input image file=','s');
file2=input('Enter Output image file=','s');
nx=input('Enter multiplication along x-axis=');
ny=input('Enter multiplication along y-axis=');
[x]=imread(file1);
[r,c,d]=size(x);
i1=1;
j1=1;
i1u=i1+nx;
j1u=j1+ny;
    for i=1:r
        for j=1:c
            px=x(i,j,1:d);
            for ki=1:nx
                for kj=1:ny
                    y(i1:i1u,j1:j1u,1)=x(i,j,1);
                    y(i1:i1u,j1:j1u,2)=x(i,j,2);
                    y(i1:i1u,j1:j1u,3)=x(i,j,3);
                    j1=j1+ny;
                    j1u=j1u+ny;
                end
            i1=i1+nx;
            i1u=i1u+nx;
            end
       end
    fprintf('i1=%d j1=%d i1u=%d j1u=%d\n',i1,j1,i1u,j1u);
    end
    fprintf('i1=%d j1=%d i1u=%d j1u=%d\n',i1,j1,i1u,j1u);
    imshow(y);
    imwrite(y,file2);
    
    
        

