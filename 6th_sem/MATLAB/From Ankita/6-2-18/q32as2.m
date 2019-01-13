%q12as1.m-to find product of n numbers
clc;
clear all;
close all;
n=input('\nEnter size of your list(1-20)=');
fprintf('\nEnter elements and its index in your list---->\n');
for i=1:n
    fprintf('a(%d)=',i);
    a(i)=input('');
    id(i)=i;
end
[a,id,n1]=bubble(a,id,n);
ch='y';
while ch=='y' || ch=='Y'
    fprintf('\nEnter number to be searched=');
    num=input('');
    binary_search(a,id,n,num);
    ch=input('\nDo you want to search any more number(Y/N)?:','s');
end
%fprintf('\Product of %d numbers=%d\n',n,y);
%end of main module