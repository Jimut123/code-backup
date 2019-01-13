%function y=sum_array(a,n) : Function to calculate sum of n elements of an
%array
function y=sum_array(a,n)
s=0;
for i=1:n
    s=s+a(i);
end
y=s;
end