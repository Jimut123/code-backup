clc;
clear all;
close all;


n=input('Enter the number of elements\n');

for i=1:n
	a(i)=input('Enter element\n','s');
	f(i)=1;
end

fprintf('Input Array is : \n')
for i=1:n
	fprintf('%s \n',a(i));
end

for i=1:n
    for j=i+1:n
        if a(i)>a(j)
            t=a(i);
            a(i)=a(j);
            a(j)=t;
        end
    end
end

fprintf('Sorted Array is : \n')
for i=1:n
	fprintf('%s \n',a(i));
end
