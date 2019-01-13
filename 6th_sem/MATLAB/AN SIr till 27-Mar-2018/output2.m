to beginning of input file
n1=fix(n/2);
n2=n-n1;
fp2=fopen(file2,'w');
fp3=fopen(file3,'w');
for i=1:n
    ch=fread(fp1,1);
    if i<=n1
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end
fclose('all');
fprintf('\nsize of <%s>=%d Bytes\n',file2,n1);
fprintf('size of <%s>=%d Bytes\n',file3,n2);
fprintf('size of <%s>=%d Bytes\n',file1,n);
%end of program



