%function h=hcf(a,b) : Function to calculate hcf of 2 numbers
function h=hcf(a,b)
r=mod(a,b);
while r ~=0
    a=b;
    b=r;
    r=mod(a,b);
end
h=b;
end
