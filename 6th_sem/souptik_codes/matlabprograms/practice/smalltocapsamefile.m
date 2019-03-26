clc;
clear all;
close all;

file1=input('Enter input file name','s');
fp1=fopen(file1,'rt');
fseek(fp1,0,+1);
n=ftell(fp1);
fseek(fp1,0,-1);
for i=1:n 
	ch=fread(fp1,1);
	if((ch>=97)&(ch<=122))
		ch=ch-32;
    end
    fseek(fp1,-1,0);
	fwrite(fp1,ch);
end
fclose('all');