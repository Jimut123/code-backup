%Calculate sin(x), cos(x) and tan(x) where x=0 to 360 in step of 5.

clc;
clear all;
close all;
for i=0:5:360
    y1=sine(i);
    y2=cosine(i);
    y3 = tangent(i);
    fprintf('sin(%d)=%5.1f \t\t cos(%d)=%5.1f \t\t tan(%d)=%12.8f \n',i, y1, i, y2, i, y3);
end