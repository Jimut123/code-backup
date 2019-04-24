%function [a1,id1,n1]=merge1(a,id,n) : Function to sort data using merge
%sort method
function [a,id,n]=merge1(a,id,n)
% initializing aux() and iux() to 0
aux=zeros(n);
iux=zeros(n);
size=1;
while size<=n
ix=1;
ia=1;
    while (ia+size)<=n
        ua=ia+size-1;
        ib=ua+1;
        if (ib+size-1)<=n
            ub=ib+size-1;
        else
            ub=n;
        end
        i=ia;
        j=ib;
       
            while i<=ua && j<=ub
                if a(i)<a(j)
                    aux(ix)=a(i);
                    iux(ix)=id(i);
                    ix=ix+1;
                    i=i+1;
                else
                    aux(ix)=a(j);
                    iux(ix)=id(j);
                    ix=ix+1;
                    j=j+1;
                end
            end
            while i<=ua
                aux(ix)=a(i);
                iux(ix)=id(i);
                i=i+1;
                ix=ix+1;
                fprintf('i=%d ix=%d ua=%d\n',i,ix,ua);
                ch=input('\nPress enter key--->','s');
           end
            while j<=ub
                aux(ix)=a(j);
                iux(ix)=id(j);
                j=j+1;
                ix=ix+1;
            end
        ia=ub+1;
        end
        while ix<=n
            aux(ix)=a(ia);
            iux(ix)=id(ia);
            ix=ix+1;
            ia=ia+1;
        end
        % To copy back all elements
        for i=1:n
            a(i)=aux(i);
            id(i)=iux(i);
        end
        size=2*size;
end
fprintf('\nSorted List\n');
fprintf('Number\tIndex\n');
    for i=1:n
        fprintf('%d\t\t%d\n',a(i),id(i));
    end
end