%audio2.m: Write a program to input any audio file and number of times file to be
%copied say 'n'. Copy input audio file n-times in some output file.Play and save the same file.
clc;
close all
clear all;
file1=input('\nEnter input audio file name=','s');
file2=input('Enter output audio file name=','s');
n=input('Enter how many times you want to copy the file=');
[x,fs,nb]=wavread(file1);
[nx,d]=size(x);
fprintf('nx=%d d=%d fs=%d nb=%d\n',nx,d,fs,nb);
nx1=1;
nx2=nx;
for i=1:n
    y(nx1:nx2)=x(1:nx);
    nx1=nx1+nx;
    nx2=nx2+nx;
end
plot(y); % To plot final audio file
sound(y,fs); % To play audio file
wavwrite(y,fs,file2);
%end of file


