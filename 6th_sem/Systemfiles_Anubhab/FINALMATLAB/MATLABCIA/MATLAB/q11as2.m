%q11as2.m : Write main program to implement bubble sort routine
clc;
close all;
clear all;
n=input('\nEnter size of your list(1-20)=');
fprintf('\nEnter %d elements one by one--->\n',n);
for i=1:n
    fprintf('a(%d)=',i);
    a(i)=input('');
    id(i)=i;
end
[a,id,n]=merge1(a,id,n);
%end of main program