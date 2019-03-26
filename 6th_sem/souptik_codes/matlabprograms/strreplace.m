clc;
clear all;
close all;

file1=input('Enter input file name','s');
search=input('Enter string pattern to be replaced','s');
replace=input('Enter replacing pattern','s');

fp1=fopen(file1,'rt');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
sl=length(search);
rl=length(replace);
disp=0;
while ~feof(fp1)
    ch=fread(fp1,sl);
    flag=1;
    for i=1:sl
        if ch(i)~=search(i)
            flag=0;
            break;
        end
    end
    if flag==1
        fseek(fp1,-s1,0);
        if rl==sl
            for i=1:r1
            fwrite(fp1,replace(i));
            end
        elseif r1<s1
            for i=1:r1
            fwrite(fp1,replace(i));
            end
            for i=1:sl-r1
              fwrite(fp1,08);
            end  
        end
    else
        fseek(fp1,-sl+1,0);
    end
end