% To find the number of prime numbers in a given range! 
clc;
close all;
clear all;
n=input('\n Enter n(1-20) = ');
for i=1:n
  k=isPrime(i);
  if k==1
    fprintf("%d ",i);
  endif
endfor
fprintf("\n")
