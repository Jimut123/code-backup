def polar(x,y)
    theta = Math.atan2(y,x)
    r = Math.hypot(x,y)
    [r, theta]
end

dist, ang = polar(2, 2)
print "distance : #{dist} and angle : #{ang} \n"