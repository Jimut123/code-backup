%q9nas1.m: Write a program to calculate sum, difference and product of 2
%matrices.
clc;
close all;
clear all;
n=input('\nEnter size of your square matrix(1-10)=');
fprintf('\nEnter elements of Matrix -a(,)-->\n');
for i=1:n
    for j=1:n
        fprintf('a(%d,%d)=',i,j);
        a(i,j)=input('');
    end
end

fprintf('\nEnter elements of Matrix -b(,)-->\n');
for i=1:n
    for j=1:n
        fprintf('b(%d,%d)=',i,j);
        b(i,j)=input('');
    end
end

s=a+b; % To calculate sum of two matrices
d=a-b; % To calculate difference of two matrices
p=a*b;%  To calculate product of two matrices
fprintf('\nElements sum of 2 matrices--->\n');
for i=1:n
    for j=1:n
        fprintf('%d\t',s(i,j));
    end
    fprintf('\n');
end

fprintf('\nElements difference of 2 matrices--->\n');
for i=1:n
    for j=1:n
        fprintf('%d\t',d(i,j));
    end
    fprintf('\n');
end
fprintf('\nElements product of 2 matrices--->\n');
for i=1:n
    for j=1:n
        fprintf('%d\t',p(i,j));
    end
    fprintf('\n');
end
%End of program


