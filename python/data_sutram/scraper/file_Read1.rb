# Read one line from a file!
c = 0

File.open("data.txt") do |f|
    c +=1
    line = f.readline
    print "Line no : #{c} line : #{line}"
end