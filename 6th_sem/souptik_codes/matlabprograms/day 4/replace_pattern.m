clc;
close all;
clear all;
file1=input('\n enter input file name=','s');
file2=input('\n enter output file name=','s');
pat1=input('\n enter pattern to be found','s');
pat2=input('\n enter new pattern to be replaced','s');

fp1=fopen(file1);
a=fread(fp1);
b=strrep(a,pat1,pat2);
fclose(fp1);
fprintf('rhe replaced pattern is %s',b);
fp2=fopen(file2,'w');
fwrite(fp2,b);





