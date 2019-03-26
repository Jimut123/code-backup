clc;
clear all;
close all;


nv=0;
nc=0;
na=0;
file1=input('Enter input file name','s');
fp1=fopen(file1,'r');
while(~feof(fp1))
    ch=fread(fp1,1,'uint8=>char');
    ch1=upper(ch);
    if(ch1>='A' & ch<='Z')
        na=na+1;
        if ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U'
            nv=nv+1;
        end
    end
end

nc=na-nv;
fprintf('\n Number of alphabets=%d \n Number of vowels=%d \n Number of consonants=%d \n',na,nv,nc);
fclose(fp1);

    
    