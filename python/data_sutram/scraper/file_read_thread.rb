t = Thread.new do
    File.read("data.txt")
end
print t