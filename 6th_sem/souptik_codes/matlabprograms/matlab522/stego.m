clc;
close all;
clear all;
fp1=fopen('sourceFile.txt', 'r');
fp2=fopen('destFile.txt','w');
fseek(fp1,0,1);
n=ftell(fp1);
fseek(fp1,0,-1);
secret=byte_to_bit('A');
pos=1;
for i=1:n
  ch1=fread(fp1, 1, 'uint8');
  fprintf('\nChar read is %c', ch1);
  b=byte_to_bit(ch1);
  fprintf('\nByte read from file: \n');
  for i=1:8
      fprintf('%d', b(i));
  end
  fprintf('\nAfter LSB: \n');
  b(8)=secret(pos);
  for i=1:8
      fprintf('%d', b(i));
  end
  %Convert to byte again
  k=0; s=0;
  for j=8:-1:1
      s=s+b(j)*2^k;
      k=k+1;
  end
  fprintf(fp2, '%c', s);
  pos=pos+1;
end
fclose('all');

  
