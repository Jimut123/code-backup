%q10aas2.m : Write a program to extract all words from any text/matlab file
clc;
clear all;
close all;
file1=input('\nEnter Input File Name=','s');
file2=input('Enter Output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
fseek(fp1,0,1); %Moving File identifier to last byte of file1
n=ftell(fp1); % n=Size of file1
fseek(fp1,0,-1);% Moving File identifier to 1st byte
nw=0; % nw=number of words
flag=1;
for i=1:n
    ch=fscanf(fp1,'%c',1);
    ch1=upper(ch); % To convert lowwer case alphabet to upper case alphabet
    if ch1>='A' & ch1<='Z'
        if flag==1
            nw=nw+1;
            flag=0;
        end
        fprintf('%c',ch);
        fwrite(fp2,ch);
    elseif flag==0
        flag=1;
        fprintf('\n');
        fprintf(fp2,'\n');
    end
end
fclose('all');
fprintf('\nNumber of words in your file=%d\n',nw);
%End of program