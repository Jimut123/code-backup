%Find frequency of every element in array
clc;
close all;
clear all;
t=0;
n=input('\nEnter the number of elements');
for i=1:n
    a(i)=input('Enter the elements: ');
end
for i=1:n
    for j=1:n-i
    if(a(j)>a(j+1))
        t=a(j);
        a(j)=a(j+1);
        a(j+1)=t;
    end
    end
end
for i=1:n
    fprintf('%f',a(i));
end        
findFrequency(a,n);

