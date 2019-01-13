%function [x,n]=matrix_inversion(a,b,n):Function to solve linear
%simultaneous equations using matrix inversion method
function [x,n]=matrix_inversion(a,b,n)
%To initialize augmented matrix
aug=a; %copying matrix a(,) to matrix aug(,)
%To add identity matrix on RHS of aug(,)
for i=1:n
    for j=1:n
        if i==j
            aug(i,j+n)=1;
        else
            aug(i,j+n)=0;
        end
    end
end
n1=2*n;
% to display initial augmented matrix
for i=1:n
    for j=1:n1
        fprintf('%8.4f\t',aug(i,j));
    end
    fprintf('\n');
end
%to transform augmented matrix
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
        end
    end
    fprintf('\nElements in augmented Matrix-->\n');
    for i1=1:n
        for j1=1:n1
            fprintf('%8.4f\t',aug(i1,j1));
        end
        fprintf('\n');
    end
    choice=input('\nPress enter key to continue--->','s');
end
%To extract inverse matrix from aug(,)
for i=1:n
    for j=1:n
        inverse(i,j)=aug(i,j+n);
    end
end
%to calculate Roots of equations
for i=1:n
    s=0;
    for j=1:n
        s=s+inverse(i,j)*b(j);
    end
    x(i)=s;
end
fprintf('\nElements in inverse matrix--->\n');
for i=1:n
    for j=1:n
        fprintf('%8.4f\t',inverse(i,j));
    end
    fprintf('\n');
end
end