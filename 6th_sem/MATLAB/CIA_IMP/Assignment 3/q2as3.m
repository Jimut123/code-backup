%q2as3.m : Write a program to solve linear simultaneous equations using
%matrix inversion method
clc;
close all;
clear all;
n=input('\nEnter number of simultaneous equations (n)=');
fprintf('\nEnter coefficients of equations--->\n');
for i=1:n
    for j=1:n
        fprintf('a(%d,%d)=',i,j);
        a(i,j)=input('');
    end
 fprintf('b(%d)=',i);
 b(i)=input('');
end
[x,n]=matrix_inversion(a,b,n);
fprintf('\nSolutions are --->\n');
for i=1:n
    fprintf('x(%d)=%7.4f\n',i,x(i));
end
%end of main program
