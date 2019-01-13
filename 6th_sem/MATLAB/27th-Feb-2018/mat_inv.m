%function [x,n]=mat_inv(a,b,n) : Function to solve linear simultaneous
%equations using matrix inversion method
function [x,n]=mat_inv(a,b,n)
%To form augmented matrix
n1=2*n;
aug=a; % copying a to aug
for i=1:n
    for j=1:n
        if i==j
            aug(i,j+n)=1;
        else
            aug(i,j+n)=0;
        end
    end
end
fprintf('\nElements in initial augmented Matrix--->\n');
for i=1:n
    for j=1:n1
        fprintf('%7.2f\t',aug(i,j));
    end
    fprintf('\n');
end
% To get inverse matrix from augmented matrix
for i=1:n
    am=aug(i,i);
    for j=1:n1
        aug(i,j)=aug(i,j)/am;
    end
    for j=1:n
        if i~=j
            am=aug(j,i);
            for k=1:n1
                aug(j,k)=aug(j,k)-aug(i,k)*am;
            end
    fprintf('\nElements in Augmented Matrix--->\n');
        for i1=1:n
            for j1=1:n1
                fprintf('%7.2f\t',aug(i1,j1));
            end
            fprintf('\n');
        end
        choice=input('\nPress enter key to continue===>','s');
        end
    end
end
% To extract Inverse matrix
for i=1:n
    for j=1:n
        inverse(i,j)=aug(i,j+n);
    end
end
fprintf('\nElements in Inverse matrix--->\n');
for i=1:n
    for j=1:n
        fprintf('%8.4f\t',inverse(i,j));
    end
    fprintf('\n');
end
% To calculate roots of simultaneous euqations
for i=1:n
s=0;
    for j=1:n
        s=s+inverse(i,j)*b(j);
    end
    x(i)=s;
end
end