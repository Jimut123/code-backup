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
fprintf('\nEnter elements of Matrix1a b(,) --->\n');
for i = 1:n
    for j = 1:n
        fprintf('b(%d,%d) = ',i,j);
        b(i,j)=input('');
    end
end
sum=a+b;
diff=a-b;
prod=a*b;
fprintf('Elements of Sum of two matrices--->\n');
for i = 1:n
    for j = 1:n
        fprintf('%d\t', sum(i,j));
    end
    fprintf('\n');
end
fprintf('Elements of Diff of two matrices--->\n');
for i = 1:n
    for j = 1:n
        fprintf('%d\t', diff(i,j));
    end
    fprintf('\n');
end
fprintf('Elements of Product of two matrices--->\n');
for i = 1:n
    for j = 1:n
        fprintf('%d\t', prod(i,j));
    end
    fprintf('\n');
end