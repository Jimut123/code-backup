clc;
close all;
clear all;
n=input('\nEnter number of elements: ');
fprintf('\nEnter elements of a(,) --->\n');
for i = 1:n
    fprintf('a(%d) = ',i);
    a(i)=input('');
end
frequency_of_number(a,n)
