a = [1, 2, 3, 4]
b = a.map{ |x| x*x}
print b
c = a.select{ |x| x%2 == 0}
a.inject do |sum,x|
    sum+x
end
print a
#print c