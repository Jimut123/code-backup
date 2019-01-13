%sum_of_array.m : s=sum_of_array(a,n) : Function to calcu;ate sum of 'n'
%elements
function [s]=sum_of_array(a,n)
s=0;
    for i=1:n
        s=s+a(i);
    end
end
