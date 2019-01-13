me=','s');
fp1=fopen(file1,'r');
fp2=fopen(file2,'w');
ch=fread(fp1);
l=length(ch);
fwrite(fp2,ch);
fprintf('\nNumber of Bytes copied=%d\n',l);
%end of program


    
