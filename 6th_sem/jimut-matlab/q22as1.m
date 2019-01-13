% To print the series of fibonacci numbers upto number N which are prime
clc;
close all;
clear all;
n=input('\n Enter n(1-20) = ');
fprintf("%d %d ",0,1);
a=0;
b=1;
c=a+b;
while c<=n
  if isPrime(c) == 1
    fprintf("%d ",c);  
  endif
  a=b;
  b=c;
  c=a+b;
endwhile


