clc;
close all;
file1 = input('\n Enter the name  of input file : ','s');
N = input('\n Enter the number of files to be split : ');
o_file_name = input('\n Enter the general name  of output file : ','s');

fp1 = fopen(file1,'r');
fseek(fp1,0,1); %end of the file 1
n = ftell(fp1);
fprintf('\n N = %d',N);
fprintf('\n n = %d',n);
gen_N = round(n/N);
fprintf('\n gen_N = %d',gen_N);
fseek(fp1,0,-1); % to move to the begining of the input file
k=0;
name = 1;
% to open file successively

for i=1:N
    
end
for i=1:n
    ch=fread(fp1,1);
    k=k+1;
    if(k<=gen_N)
        file_name = o_file_name+'_'+name;
        fwrite(file_name,ch);
    end
    if(k>gen_N)
        k=0;
        name=name+1;
    end
end
