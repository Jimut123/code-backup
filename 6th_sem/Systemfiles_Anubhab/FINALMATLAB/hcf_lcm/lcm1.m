%function lc=lcm1(a,b) : Function to calculate lcm of 2 numbers
function lc=lcm1(a,b)
h=hcf1(a,b);
lc=a*b/h;
end