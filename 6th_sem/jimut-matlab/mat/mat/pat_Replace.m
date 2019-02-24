clc;
close all;
file1 = input('\n Enter Input file name : ','s');
file2 = input('\n Enter Output file name : ','s');
opat = input('\n Enter old pattern to be searched : ','s');
npat = input('\n Enter new pattern to be replaced : ','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
leno=length(opat);
lenn=length(npat);
nc=0; %nc = no. of times pattern replaced

while ~feof(fp1)
    ch=fread(fp1,1,'unit8=>char');
    ch1=upper(opat(1));
    flag=1;
end
