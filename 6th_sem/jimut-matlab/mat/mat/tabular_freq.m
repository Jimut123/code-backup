clc;
%clear all;
close all;
a = [];
% Works, to find the number of occurences of numbers
N = input('\n Enter the number of numbers to be inputted : ');
for i=1:N
    a(i) = input('Enter number : ');
end
for i=1:N
    if(a(i)~=NaN)
        num=a(i);
    end
    sum=0;
    for j=1:N
        k=a(j);
        if (num==k && num ~= NaN)
            sum=sum+1;
            a(j)=NaN;
        end
    end
    if sum~=0
        fprintf('Number of occurence of %d is %d\n',num,sum);
    end
end