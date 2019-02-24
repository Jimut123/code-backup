clc;
%clear all;
close all;
%prompt = "\n";
n = input('Enter the number of numbers to find the HCF : ');
a = [];
for i=1:n
    a(i)=input('Input : ');
end
%for i=1:n
%    fprintf('%d ',a(i))
%end
for i=2:n
    hcf1=hcf_2(a(i),a(i-1));
    a(i) = hcf1;
end
fprintf('Final HCF = %d',a(n));
