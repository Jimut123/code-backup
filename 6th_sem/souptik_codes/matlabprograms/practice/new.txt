clc;
clear all;
close all;

file1=input('Enter input file name','s');
file2=input('Enter output file name','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'wt');
while ~feof(fp1)
	ch=fread(fp1,1);
	if ((ch>=97)&(ch<=122))
		ch=ch-32;
	end
	fwrite(fp2,ch);
end
fclose('all');
