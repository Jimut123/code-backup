% to merge two audio files
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
i=1;
j=1;
if (yr)<(xr)
    len=yr;
    copy=y;
    copy2=x;
    while j<=len % should be j<=len
    z(i)=copy(j);
    z(i+1)=copy2(j);
    i=i+2;
    j=j+1;
    end
    z(i:i+(xr-yr))=copy2(j:j+(xr-yr));
else
    len=xr;
    copy=x;
    copy2=y;
    while j<=len
    z(i)=copy(j);
    z(i+1)=copy2(j);
    i=i+2;
    j=j+1;
    end
    z(i:i+(yr-xr))=copy2(j:j+(yr-xr));
end


if xfs>yfs
    zfs=xfs;
else
    zfs=yfs;
end



wavplay(z,zfs);
wavwrite(z,zfs,file3);

plot(x);
plot(y);
plot(z);
