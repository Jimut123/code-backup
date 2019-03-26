%wap to copy audio multiple times and play modified file
clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter output audio file name=','s');
[x,fs,nbits]=wavread(file1);
[r,c]=size(x);
n=input('Enter the number of times the file to be copied');
fprintf('r=%d c=%d fs=%d nb=%d',r,c,fs,nbits);
r1=1;
r2=r;
%x(1:r)=x(r:-1:1); for reversing
for i=1:n
    y(r1:r2)=x(1:r);
    r1=r1+r;
    r2=r2+r;
end
wavplay(y,fs);
wavwrite(y,fs,file2);