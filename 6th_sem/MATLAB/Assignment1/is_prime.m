%function flag = is_prime(n): Function to test whether n is prime or not a
%prime. Th function will return 1 if n is a prime otherwise it will return
%0

function flag = is_prime(n)
n1 = fix(n/2);
flag = 1;
for i = 2:n1
    r = mod(n, i);
    if r == 0
        flag  = 0;
    end
end
        