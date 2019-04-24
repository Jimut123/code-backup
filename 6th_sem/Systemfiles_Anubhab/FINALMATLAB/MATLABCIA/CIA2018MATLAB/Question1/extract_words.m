%q10nas2.m : Write a program to extract all words from any input file
clc;
close all;
clear all;
file1=input('\nEnter Input File Name = ','s');
file2=input('\nEnter Output File Name = ','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
nw=0;
flag=1;
while ~feof(fp1)
    ch=fread(fp1,1,'uint8=>char');
    ch1=upper(ch);
    if ch1>='A' & ch1<='Z'
        if flag==1
            nw=nw+1;
            flag=0;
        end
        fprintf('%c',ch);
        fwrite(fp2,ch);
    elseif flag==0
        fprintf('\n');
        fwrite(fp2,13);
        fwrite(fp2,10);
        flag=1;
    end
end
fclose('all');
fprintf('\nNumber of words extracted = %d\n',nw);
%end of program