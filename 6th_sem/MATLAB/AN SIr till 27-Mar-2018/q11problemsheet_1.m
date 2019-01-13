%q11problemsheet_1.m : Write a program to input 'n' where n>=2 and n<=2000.
%Print all prime numbers <= n
clc;
close all;
clear all;
n=input('\nEnter n(2-2000)=');
fprintf('\nPrime numbers <=%d--->\n',n);
count=0;
    for i=2:n
        m=is_prime(i);
        if m==1
            fprintf('%d\n',i);
            count=count+1;
        end
    end
fprintf('\nTotal prime numbers shown=%d\n',count);
%End of main
