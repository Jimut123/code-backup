%q6as1.m : Write a program to input n- elements of 1 dim array say a().
% Calculate and print (i) sum, (ii) average, (iii)largest value,
% (iv)standard deviation.
clc;
close all;
clear all;
n=input('\Enter size of your list=');
fprintf('\nEnter %d elements one by one--->\n',n);
for i=1:n
 fprintf('a[%d]=',i);
 a(i)=input('');
end
format long;
s=sum_array(a,n);
avg=average_array(a,n);
big=large(a,n);
sdev=standard_deviation(a,n);
fprintf('\nSum=%d Average=%5.2f Largest value=%d Standard Deviation=%7.4f\n',s,avg,big,sdev);
%End of program
