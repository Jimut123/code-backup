%q10nas2.m : Write a program to extract all words from any given file
clc;
close all;
clear all;
%word=zeros(50,10);
file1=input('\nEnter Input File Name=','s');
file2=input('Enter output File Name=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
flag=1;
nw=0;
j=1;
while ~feof(fp1)
    ch=fscanf(fp1,'%c',1);
    ch1=upper(ch);
    if ch1>='A' & ch1<='Z'
        if flag==1
            flag=0;
            nw=nw+1;
        end
        fprintf('%c',ch);
        word(nw,j)=ch;
        fprintf(fp2,'%c',ch);
        j=j+1;
    elseif flag==0
    flag=1;
    fprintf('\n');
    fprintf(fp2,'\n');
    word(nw,j)=10;
    j=1;
    end
end
fclose('all');
fp1=fopen(file2,'r');
for i=1:nw
    disp(word(i,:));
 end
fprintf('\n');
fprintf('\nNumber of words extracted=%d\n',nw);
%end of program
