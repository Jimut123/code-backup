%function s=sum11(a,n):Function to calculate s=a(1)+a(2)+....a(n)
function s=sum11(a,n)
s=0;
for i=1:n
    s=s+a(i);
end
end