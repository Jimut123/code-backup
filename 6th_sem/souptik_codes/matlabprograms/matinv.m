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
a
for i=1:n
    for j=1:2*n
        if j<=n
            aug(i,j)=a(i,j);
        else
            if j==i+n
                aug(i,j)=1;
            else
                aug(i,j)=0;
            end
        end
    end
end
aug
for i=1:n
    div=aug(i,i);
    for j=1:n
        if i==j
            for k=1:2*n
                aug(j,k)=aug(j,k)/div;
            end
        end
    end
    for j=1:n
        mul=aug(j,i);
        if i~=j
            for k=1:2*n
                aug(j,k)=aug(j,k)-mul*aug(i,k);
            end
        end
    end
end
aug
for i=1:n
    sum=0;
    for j=4:2*n
        sum=sum+aug(i,j)*b(j-3);
    end
    x(i)=sum;
end

for i=1:n
    fprintf('x[%d]=%d\n',i,x(i));
end
                
        