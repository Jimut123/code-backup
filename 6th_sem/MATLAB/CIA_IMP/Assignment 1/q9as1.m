%q9as1.m : Write a program to input 2 2-dimensional matrices and then
%calculate and print (i) sum , (ii) difference and (iii) product of 2
%matrices.
clc;
close all;
clear all;
n=input('\nEnter size of your square matrix(1-10)=');
fprintf('\nEnter elements of Matrix a(,) --->\n');
for i=1:n
    for j=1:n
        fprintf('a(%d,%d)=',i,j);
        a(i,j)=input('');
    end
end

fprintf('\nEnter elements of Matrix b(,) --->\n');
for i=1:n
    for j=1:n
        fprintf('b(%d,%d)=',i,j);
        b(i,j)=input('');
    end
end
        
sum=a+b;  % To get sum of 2 matrices 
diff=a-b;  % To get difference of 2 matrices
prod=a*b; % To get product of 2 matrices

fprintf('\nElements of Sum of 2 matrices--->\n');
for i=1:n
    for j=1:n
        fprintf('%d\t',sum(i,j));
    end
    fprintf('\n');
end

fprintf('\nElements of Difference of 2 matrices--->\n');
for i=1:n
    for j=1:n
        fprintf('%d\t',diff(i,j));
    end
    fprintf('\n');
end

fprintf('\nElements of Product of 2 matrices--->\n');
for i=1:n
    for j=1:n
        fprintf('%d\t',prod(i,j));
    end
    fprintf('\n');
end
%end of program
