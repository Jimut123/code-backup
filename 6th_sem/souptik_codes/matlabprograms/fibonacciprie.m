clc;
clear all;
close all;
n=input('\n Enter n: ');
a=+1;
b=+1;
c=a+b;
while c<=n
    chp=checkPrime(c);
    if chp==1 
        fprintf('%d \n',c);
    end
    a=b;
    b=c;
    c=a+b;
end
