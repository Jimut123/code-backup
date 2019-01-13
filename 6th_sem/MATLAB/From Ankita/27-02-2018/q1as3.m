%Solve linear simultaneous equation using Gauss Elimination Method
clc;
close all;
clear all;
n=input('\nEnter number of simultaneous equations (n)=');
fprintf('\n Enter coefficients of equations--->\n');
for i=1:n
    for j=1:n
        fprintf('a(%d,%d)=',i,j);
        a(i,j)=input('');
    end
    fprintf('b(%d)=',i);
    b(i)=input('');
end
[x,n]=gauss_elimination(a,b,n);
fprintf('\nSolutions are--->\n');
for i=1:n
    fprintf('x(%d)=%7.4f\n',i,x(i));
end