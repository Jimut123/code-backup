%q11as1.m : Write main function to calculate s=(1)+(1+2)+...+(1+2+...+n)
clc;
close all;
clear all;
n=input('\nEnter n(1-20) = ');
s=sum1(n);
fprintf('\nn = %d Sum = %d\n',n,s);
s=sum2(n);
fprintf('\nn = %d Sum = %d\n',n,s);
s=sum3(n);
fprintf('\nn = %d Sum = %d\n',n,s);
s=sum4(n);
fprintf('\nn = %d Sum = %d\n',n,s);
s=sum5(n);
fprintf('\nn = %d Sum = %d\n',n,s);
%end