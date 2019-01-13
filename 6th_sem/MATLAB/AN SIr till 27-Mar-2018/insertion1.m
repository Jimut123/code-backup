%function [a1,id1,n1]=insertion1(a,id,n) : Function to sort numbers using
%insertion  sort algorithm
function [a1,id1,n1]=bubble1(a,id,n)
n1=n;
for i=1:n1
    a1(i)=a(i);
    id1(i)=id(i);
end
% Insertion  sort method starts
pass=0;

for i=2:n
    t1=a1(i);
    t2=id1(i);
    pass=pass+1;
   j=i-1;
   while j>=1 && t1<a(j)
       a1(j+1)=a1(j);
       id1(j+1)=id1(j);
       j=j-1;
           clc;
        fprintf('\nPass=%d Step=%d\n',pass,i);
        fprintf('\nNumber\tIndex\n');
        for j1=1:n1
            fprintf('%d\t\t%d\n',a1(j1),id1(j1));
        end
        ch=input('\nPress any key to continue--->','s');
   end
   a1(j+1)=t1;
   id1(j+1)=t2;
       clc;
        fprintf('\nPass=%d Step=%d\n',pass,i);
        fprintf('\nNumber\tIndex\n');
        for j1=1:n1
            fprintf('%d\t\t%d\n',a1(j1),id1(j1));
        end
        ch=input('\nPress any key to continue--->','s');
end
        clc;
        fprintf('\nPass=%d Step=%d\n',pass,i);
        fprintf('\nNumber\tIndex\n');
        for j=1:n1
            fprintf('%d\t\t%d\n',a1(j),id1(j));
        end
        ch=input('\nPress any key to continue--->','s');
    end
    
