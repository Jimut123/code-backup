clc;
%clear all;
close all;
a = [];
N = input('\n Enter the number of numbers to be inputted : ');
for i=1:N
    a(i) = input('Enter number : ');
end
k = sort(a);
s=0;
for i=1:N
    num=k(i);
    s=s+1;
    while(k(i+1)==num)
        s=s+1;
        i=i+1;
    end
    fprintf('Number of occurence of %d is %d\n',num,s);
    s=0;
end