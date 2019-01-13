%prg to remove comments
clc;
close all;
clear all;
file1=input('\nEnter input file name=','s');
file2=input('\nEnter output file name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
byte=0;
nc=0;
for i=1:n
    ch=fscanf(fp1,'%c',1);
    if ch==39
        fwrite(fp2,ch);
        ch=fscanf(fp1,'%c',1);
        while ch ~=39
            fwrite(fp2,ch);
            ch=fscanf(fp1,'%c',1);
        end
    elseif ch=='%'
            nc=nc+1;
            while ch~=10
                ch=fscanf(fp1,'%c',1);
            end
        else
            fwrite(fp2,ch);
    end
end
fprintf('\nNumber of bytes copied = %d',n);
%to show no. of comment lines removed
fprintf('\nNumber of comment lines removed= %d',nc);

        
            