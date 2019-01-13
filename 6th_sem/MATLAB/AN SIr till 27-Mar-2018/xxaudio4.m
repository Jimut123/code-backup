%xxaudio4.m : Write a program to mix one human voice and one instrumental
% Play mixed sound effect
clc;
close all;
clear all;
file1=input('\nEnter Fore ground audio file name=','s');
file2=input('Enter Back ground audio file name=','s');
[x1,fs1,nbits1]=wavread(file1);
[x2,fs2,nbits2]=wavread(file2);
[y1,n1]=size(x1);
[y2,n2]=size(x2);
if y1<y2
    y=y1;
else
    y=y2;
end
if fs1<fs2
    fs=fs2;
else
    fs=fs1;
end
z(1:2:2*y)=1.5*x1(1:y);
z(2:2:2*y)=x2(1:y);
sound(z,fs);
wavwrite(z,fs,file2);



