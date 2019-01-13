%anaudio3.m: Write a program to mix two audio files
clc;
close all;
clear all;
file1=input('\nEnter Input Audio File (speech file) =','s');
file2=input('Enter Input Audio File (Instrumental)=','s');
[x1,fs1,nbit1]=wavread(file1);
[x2,fs2,nbit2]=wavread(file2);
[y1,n1]=size(x1);
[y2,n2]=size(x2);
if y1<y2
    yf=y1;
else
    yf=y2;
end
% To copy sound data from speech file and instrumental file
j=0;
fprintf('yf=%d fs1=%d fs2=%d\n',yf,fs1,fs2);
%for i=1:yf
%j=j+1;
z(1:2:2*yf)=1.5*x1(1:yf);
%j=j+1;
z(2:2:2*yf)=1.5*x2(1:yf);
%end
sound(z,2*fs1);
wavwrite(z,fs1,file2);

    
