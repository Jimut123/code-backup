%wap to mix 2 audios

clc;
clear all;
close all;

file1=input('\n Enter input audio file name=','s');
file2=input('\n Enter 2nd input audio file name=','s');
file3=input('\n Enter output file name=','s');

[x,xfs,xnbits]=wavread(file1);
[xr,xc]=size(x);

[y,yfs,ynbits]=wavread(file2);
[yr,yc]=size(y);

if xr<yr
    r=xr;
else
    r=yr;
end
if xc<yc
    c=xc;
else
    c=yc;
end

if xfs<yfs
    fs=xfs;
else
    fs=yfs;
end
% to mix 2 audio files
z(1:r,1:c)=.5*(3*x(1:r,1:c)+y(1:r,1:c));
wavplay(z,fs);
wavwrite(z,fs,file3);