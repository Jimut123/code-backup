h = {
    :one => 1,
    :two => 2
}
#print h[:one]
h[:three] = 3
#print h
h.each do |key, value|
    print "#{value} : #{key}"
end