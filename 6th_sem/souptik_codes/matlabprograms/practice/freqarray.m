clc;
clear all;
close all;


n=input('Enter the number of elements\n');

for i=1:n
	a(i)=input('Enter element\n');
	f(i)=1;
end

fprintf('Input Array is : \n')
for i=1:n
	fprintf('%d',a(i));
end

for i=1:n
	for j=i+1:n
		if(a(i)==a(j) && f(i)~=-1)
			f(i)=f(i)+1;
			f(j)=-1;
		end
	end
end

fprintf('The frequency of numbers are : \n')

for i=1:n
	if f(i)~=-1
		fprintf('The element %d occurs %d times \n',a(i),f(i));
	end
end
