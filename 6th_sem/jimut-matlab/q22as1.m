% To print the series of fibonacci numbers upto number N
clc;
close all;
clear all;
n=input('\n Enter n(1-20) = ');
fprintf("%d %d ",0,1);
a=0;
b=1;
c=a+b;
while c<=n
  fprintf("%d ",c);
  a=b;
  b=c;
  c=a+b;
endwhile


