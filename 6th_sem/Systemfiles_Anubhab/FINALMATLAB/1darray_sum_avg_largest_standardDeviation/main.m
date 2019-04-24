%q6as1.m : Write a program to input size of 1-dim array say 'n'. Input
%n-elements and store in 1-dim array a(). Calculate and print the
%following:  (i) s=(1)+a(2)+....+a(n), (ii)avg=s/n,(iii) largest value and
%(iv) standard deivation. Use your own functions.

clc;
close all;
clear all;
n=input('\nEnter size of your list(1-20) = ');
fprintf('\nEnter %d elements one by one--->\n',n);
for i=1:n
    fprintf('a(%d) = ',i);
    a(i)=input('');
end
s=sum11(a,n);
big=large(a,n);
avg=average(a,n);
sd=standard_deviation(a,n);
fprintf('Sum = %d Largest Value = %d Average = %5.2f Standard Dev = %10.6f\n',s,big,avg,sd);
%end of program