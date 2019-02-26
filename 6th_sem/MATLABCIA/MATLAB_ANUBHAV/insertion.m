%function [a1,id1,n1]=insertion(a,id,n) : Function to implement insertion sort
%algorithm
function [a1,id1,n1]=insertion(a,id,n)
n1=n;
for i=1:n1
    a1(i)=a(i);
    id1(i)=id(i);
end
% Insertion sort algorithm starts
pass=0;

for i=2:n
    pass=pass+1;
    j=i-1;
    t1=a1(i);
    t2=id1(i);
    while j>=1 && t1<a1(j)
        a1(j+1)=a1(j);
        id1(j+1)=id1(j);
        j=j-1;
    end
    a1(j+1)=t1;
    id1(j+1)=t2;
end
        
        fprintf('\nNumber\tIndex\n');
        for j=1:n
            fprintf('%d\t\t%d\n',a1(j),id1(j));
        end
end
