clc;
close all;
clear all;

n=input('Enter Matrix Dimension');

for i=1:n
    for j=1:n
        a(i,j)=input('Enter Element');
    end
    b(i)=input('Enter Element of b: ');
end

for i=1:n
    for j=1:n
        if i~=j
            m=a(j,i)/a(i,i);
            for k=1:n
                a(j,k)=a(j,k)-m*a(i,k);
            end
        b(j)=b(j)-m*b(i);
        end
    end
end
x(n)=b(n)/a(n,n);
for i=n-1:-1:1
    s=0;
    for j=i+1:n
        s=s+a(i,j)*x(j);
    end
    x(i)=(b(i)-s)/a(i,i);
end

for i=1:n
    fprintf('x[%d]=%d\n',i,x(i));
end
