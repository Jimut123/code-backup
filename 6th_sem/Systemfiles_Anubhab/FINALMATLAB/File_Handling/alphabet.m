%problem_1.m  : Write a program to calculate (i) number of vowels, (ii)
%number of consonants and (iii) number of alphabets in any text file.
%number of lines and number of words
clc;
close all;
clear all;
file1=input('\nEnter Input File Name=','s');
nv=0; % nv=number of vowels
nc=0; % nc=number of consonants
na=0; % na=number of alphabets
nl=1; %nl=number of lines
nw=1; %number of words
fp1=fopen(file1,'r');
while ~feof(fp1)
    ch=fread(fp1,1,'uint8=>char');
    ch1=upper(ch);
    if ch1>='A' & ch1<='Z'
        na=na+1;
        if ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'
            nv=nv+1;
        end
        if ch==' '
          nw=nw+1;
        end
    end
    if ch==' '
       nw=nw+1;
    end
    if ch==13
      nl=nl+1;
    end
end
nc=na-nv;
fprintf('\nNumber of Alphabets=%d Number of Vowels=%d Number of consonants=%d Number of lines = %d Number of words = %d\n',na,nv,nc,nl,nw);
fclose('all');
%end of program
