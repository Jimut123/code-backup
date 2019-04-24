%xxaudio3.m : Write a program 
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File Name = ','s');
file2=input('\nEnter Output Audio File Name = ','s');
n=input('Enter how many times you want to copy the same audio file = ');
[x,fs,nb]=wavread(file1);
[r,c]=size(x);
fprintf('r = %d c = %d fs = %d nb = %d\n',r,c,fs,nb);
r1=1;
r2=r;
for i=1:n
    y(r1:r2)=x(1:r);
    r1=r1+r;
    r2=r2+r;
end
wavplay(y,fs); %To play reverse audio file
wavwrite(y,fs,file2); %To write reverse audio data in output file.