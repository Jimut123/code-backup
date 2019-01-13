%q4flow_1.m : Write a program to input any +ve integer 'n'. Print all prime
%numbers<=n
clc;
close all;
clear all;
n=input('\nEnter any positive integer(2-2000)=');
count=0;
fprintf('\nPrime numbers <=%d--->\n',n);
    for i=2:n
        m=is_prime(i);
        if m==1
            fprintf('%d\n',i);
            count=count+1;
        end
    end
    fprintf('\nTotal prime numbers <=%d  is %d\n',n,count);
    %end of program
    