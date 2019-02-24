% Read the contents of a file
% Display the number of alphabets, vowels and consonents

clear all;
file1=input('\nEnter Input File Name=','s');
nv=0; % nv=number of vowels
nc=0; % nc=number of consonants
na=0; % na=number of alphabets
fp1=fopen(file1,'r');
while ~feof(fp1)
    ch=fread(fp1,1,'uint8=>char');
    ch1=upper(ch);
    if ch1>='A' & ch1<='Z'
        na=na+1;
        if ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'
            nv=nv+1;
        end
    end
end
nc=na-nv;
fprintf('\nNumber of Alphabets=%d Number of Vowels=%d Number of consonants=%d \n\n',na,nv,nc);
fclose('all');
%end program