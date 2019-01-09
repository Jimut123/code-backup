%function l=lcm1(a,b): function to calculate lcm of 2 numbers

function l=lcm1(a,b)
    h=hcf1(a,b);
    l=a*b/h;
end