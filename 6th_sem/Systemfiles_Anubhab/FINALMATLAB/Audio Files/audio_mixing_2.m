%audio_mixing_2.m : Write a program in Matlab to mix
clc;
close all;
clear all;
file1=input('\nEnter Input audio file name = ','s');
file2=input('\nEnter Input audio file name = ','s');
file3=input('\nEnter Output audio file name = ','s');
[x1,fs1,nb1]=wavread(file1);
[x2,fs2,nb2]=wavread(file2);
[r1,c1]=size(x1);
[r2,c2]=size(x2);
fprintf('fs1 = %d nb1 = %d r1 = %d c1 = %d\n',fs1,nb1,r1,c1);
fprintf('fs2 = %d nb2 = %d r1 = %d c2 = %d\n',fs2,nb2,r2,c2);
choice=input('\nPress Enter key to continue--->','s');
if r1<r2
    r=r1;
else
    r=r2;
end
if c1<c2
    c=c1;
else
    c=c2;
end
if fs1<fs2
    fs=fs1;
else
    fs=fs2;
end
%to mix two audio files
x(1:r,1:c)=.5*(3*x1(1:r,1:c)+x2(1:r,1:c));
wavplay(x,fs);
wavwrite(x,fs,file3);