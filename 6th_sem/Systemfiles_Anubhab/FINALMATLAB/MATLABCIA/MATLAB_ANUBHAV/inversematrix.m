%q9as1.m: Write a progrma to input 2 2-dimensional matrices and then
%calculate and print (i)Sum (ii) difference and (iii)product of 2 matrices

clc;
close all;
clear all;
n=input('\nEnter Size of your square matrix1(1-10): ');
fprintf('\nEnter elements of Matrix1a a(,) --->\n');
for i = 1:n
    for j = 1:n
        fprintf('a(%d,%d) = ',i,j);
        a(i,j)=input('');
    end
end
b=inv(a);
d=det(a);
fprintf('\nOriginal Matrix\n');
for i = 1:n
    for j = 1:n
        fprintf('%d\t',a(i,j));
    end
    fprintf('\n');
end
fprintf('\nInverse Matrix\n');
for i = 1:n
    for j = 1:n
        fprintf('%d\t',b(i,j));
    end
    fprintf('\n');
end
fprintf('\nDeterminant is = %d\n',d);