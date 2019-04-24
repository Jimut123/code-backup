%q31as2.m : Write a program to implement linear search method to search a
%number in a list
clc;
close all;
clear all;
n=input('\nEnter size of your list(1-20)=');
fprintf('\nEnter elements and it index of your list-->\n');
for i=1:n
    fprintf('a(%d)=',i);
    a(i)=input('');
    id(i)=i;
end
ch='y';
while ch=='y' | ch=='Y'
    fprintf('\nEnter number to be searched=');
    num=input('');
    linear_search(a,id,n,num);
    ch=input('\nDo you want to search any more number(Y/N?) :','s');
end
%end of main program