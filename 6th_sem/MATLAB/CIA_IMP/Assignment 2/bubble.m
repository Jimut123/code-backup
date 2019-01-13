%function [a1,id1,n1]=bubble(a,id,n) : Function to implement bubble sort
%algorithm
function [a1,id1,n1]=bubble(a,id,n)
n1=n;
for i=1:n1
    a1(i)=a(i);
    id1(i)=id(i);
end
% Bubble sort algorithm starts
pass=0;
flag=0;
m=n1;
while flag==0
    flag=1;
    pass=pass+1;
    m=m-1;
    for i=1:m
        if a1(i)>a1(i+1)
            t=a1(i);
            a1(i)=a1(i+1);
            a1(i+1)=t;
            t=id1(i);
            id1(i)=id1(i+1);
            id1(i+1)=t;
            flag=0;
        end
        clc;
        fprintf('\nPass=%d flag=%d Step=%d\n',pass,flag,i);
        fprintf('\nNumber\tIndex\n');
        for j=1:n
            fprintf('%d\t\t%d\n',a1(j),id1(j));
        end
        choice=input('\nPress enter key to continue--->','s');
    end
end
end
