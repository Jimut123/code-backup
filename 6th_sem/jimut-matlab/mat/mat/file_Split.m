% To split a file into two parts given by the name
clc;
%clear all;
file1 = input('\n Enter the input file name = ','s');
file2 = input('\n Enter the output file name [1] = ','s');
file3 = input('\n Enter the output file name [2] = ','s');

fp1 = fopen(file1,'r');
fp2 = fopen(file2,'w');
fp3 = fopen(file3,'w');

fseek(fp1,0,1); % moving file pointer to the end of the file
n=ftell(fp1);
fprintf('n = %d',n);
n1=fix(n/2);
fseek(fp1,0,-1); % moving file pointer to the begining of input file

%Spliting into two files

for i=1:n
    ch= fread(fp1,1);
    if i<=n1
        fwrite(fp2,ch);
    else
        fwrite(fp3,ch);
    end
end

fclose('all');
fprintf('\n Size of <%s> = %d Bytes\n',file2,n1);
fprintf('\n Size of <%s> = %d Bytes\n',file3,(n-n1));
fprintf('\n Size of <%s> = %d Bytes\n',file1,n);



