%q4flow_as1.m: Write a progarm to input any +ve integer 'n' where n>=2 and
%n<=2000. Display all prime numbers <=n. Use your function is_prime(n)
clc;
close all;
clear all;
n=input('\nEnter n(2-2000)=');
count=0;
fprintf('\nPrime numbers <=%d--->\n',n);
    for i=2:n
        m=is_prime(i);
            if m==1
                fprintf('%d\n',i);
               count=count+1;
            end
    end
    fprintf('\nTotal prime numbers<=%d is :%d\n',n,count);
    %End of program
    
    
        