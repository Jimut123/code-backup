%function [i,j]=maximum_value(a,n) : Function to get index of maximum value
%from off diagonal terms of a(,).
function [i,j]=maximum_value(a,n)
amax=abs(a(1,2));
i=1;
j=2;
    for i1=1:n
        for j1=i1+1:n
        amax1=abs(a(i1,j1));
            if amax1>amax
                amax=amax1;
                i=i1;
                j=j1;
            end
        end
    end
end

