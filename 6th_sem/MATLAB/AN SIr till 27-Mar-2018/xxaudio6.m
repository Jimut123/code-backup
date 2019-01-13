%xxaudio6.m : Write a program to input two(2) audio files and fix them to
%get a new audio file. Play new audio file and also save it.
clc;
clear all;
close all;
file1=input('\nEnter input audio file-1 name=','s');
file2=input('Enter input audio file-2 name=','s');
file3=input('Enter output mixed audio file name=','s');

[x1,fs1,nb1]=wavread(file1);
[x2,fs2,nb2]=wavread(file2);
[nx1,d1]=size(x1);
[nx2,d2]=size(x2);
fprintf('nx1=%d nx2=%d nb1=%d nb2=%d fs1=%d fs2=%d d1=%d d2=%d\n',nx1,nx2,nb1,nb2,fs1,fs2,d1,d2);

% mixing odd sound bits of file1 and even sound bits from file2
if nx1<nx2
    nx=nx1;
else
    nx=nx2;
end
if fs1<fs2
    fs=fs1;
else
    fs=fs2;
end
y(1:2:nx)=1.3*x1(1:2:nx);
y(2:2:nx)=x2(2:2:nx);
plot(y);
sound(y,fs);
wavwrite(y,fs,file3);
%end of program
