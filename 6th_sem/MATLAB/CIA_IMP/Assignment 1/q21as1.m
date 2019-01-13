%q21as1.m : Write a program to 'n'. Display all prime numbers<=n. Use your
%own function is_prime(n).
clc;
close all;
clear all;
n=input('\nEnter any positive integer(2-1000)=');
count=0;
fprintf('\nPrime numbers <=%d--->\n\n',n);
    for i=2:n
        flag=is_prime(i);
        if flag==1
            count=count+1;
            fprintf('%d\n',i);
        end
    end
 fprintf('\nTotal prime numbers<=%d is %d\n',n,count);
 %End of main program
  