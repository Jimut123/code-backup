clc;
clear all;
close all;

file1=input('Enter file name','s');
file2=input('Enter output file name','s');
fp1=fopen(file1,'r+');
fp2=fopen(file2,'w+');
while ~feof(fp1)
    ch=fread(fp1,1,'uint8=>char');
    if ch==''''
        while (1)
            fwrite(fp2,ch);
            ch=fread(fp1,1);
            if ch==''''
                break;
            end
        end
        fwrite(fp2,ch);
    elseif ch=='%'
        ch=fread(fp1,1);
        while ch~=10
            ch=fread(fp1,1);
        end
        fwrite(fp2,13);
        fwrite(fp2,10);
    else
        fwrite(fp2,ch);
    end
end
        