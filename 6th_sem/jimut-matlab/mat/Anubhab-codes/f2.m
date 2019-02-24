 pointer to beginning of input file
%To split input file into 2 output files
for i=1:n
    ch=fread(fp1,1);
    if i<=n1
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end
fclose('all');
fprintf('\nFile Split is over\n');
fprintf('\nSize of <%s> = %d Bytes\n',file2,n1);
fprintf('\nSize of <%s> = %d Bytes\n',file3,(n-n1));
fprintf('\nSize of <%s> = %d Bytes\n',file1,n);
%End of program