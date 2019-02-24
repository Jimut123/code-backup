% function to find the sum of all the elements of ana array!
function[s]=sumArray(a,n)
    s=0;
    for i=1:n
        s=s+a(i);
    end
end