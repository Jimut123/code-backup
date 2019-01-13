%function [x,n]=gauss_elm(a,b,n) : Function to solve linear simultaneous
%equations using gauss elimination method
function [x,n]=gauss_elm(a,b,n)
%To form triangular equation
for i=1:n
        for j=1:n
        if i ~= j
            am=a(j,i)/a(i,i);
            for k=1:n
                a(j,k)=a(j,k)-a(i,k)*am;
            end
            b(j)=b(j)-b(i)*am;
        end
        end
end
% To obtain solutions
x(n)=b(n)/a(n,n);
%To apply backward substitution method
for i=(n-1):-1:1
    s=0;
    for j=(i+1):n
        s=s+a(i,j)*x(j);
    end
    x(i)=(b(i)-s)/a(i,i);
end
end