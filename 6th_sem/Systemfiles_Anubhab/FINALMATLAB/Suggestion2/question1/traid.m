%to print all triad numbers

clc;
clear all;
close all;
i=0;
sum=0;
pro=1;
for i=100:333
    n1 = i;
    n2 = 2*n1;
    n3 = 3*n1;
    sum = sumd(n1)+sumd(n2)+sumd(n3);
    %fprintf('%d\n',sumd(n1)+sum(n2)+sumd(n3));
    pro = fact(n1)*fact(n2)*fact(n3);
    if sum == 45 && pro == factorial(9)
        fprintf('%d  %d  %d\n',n1,n2,n3);
    end 
end
