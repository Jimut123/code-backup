%q21as1.m:To display all prime numbers <n
clc;
close all;
clear all;
n=input('\nEnter any positive integer(2-1000)=');
count=0;
fprintf('\nPrime numbers<=%d---->\n',n);
    for i=2:n
       flag=is_prime(i);
       if flag==1
           fprintf('\t%d',i);
           count=count+1;
       end
    end
fprintf('\nTotal prime numbers<=%d is %d\n',n,count);