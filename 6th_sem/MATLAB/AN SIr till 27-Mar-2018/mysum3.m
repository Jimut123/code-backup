%function s=mysum3(n) : Function to calculate s=n+(n-2)+(n-4)+....
function s=mysum3(n)
s=0;
for i=n:-2:1
    s=s+i;
end
end
