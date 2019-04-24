%q93as2.m : Write a program to remove all comment lines from any matlab
%program file
clc;
close all;
clear all;
file1=input('\nEnter Input Matlab File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');

fseek(fp1,0,1); %Move File identifief to last byte
n=ftell(fp1); % To position of last byte
fseek(fp1,0,-1);% To move file identifier to 1st byte
nc=0; % nc=number of comment lines
for i=1:n
    ch=fread(fp1,1);
    if ch==39
        while 1==1
            fwrite(fp2,ch);
            ch=fread(fp1,1);
            if ch==39
                fwrite(fp2,ch);
                break;
            end
        end
    elseif ch=='%'
        nc=nc+1;
        while 1==1
            ch=fread(fp1,1);
            if ch==10
                break;
            end
        end
    else
        fwrite(fp2,ch);
    end
end
fprintf('\nNumber of comment lines removed=%d\n',nc);
fclose('all');