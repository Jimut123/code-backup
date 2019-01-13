%q5as2.m:write a program to calculate sin(x),cos(x),tan(x)
%for x=1.0 to 2.0 in step of .1
format long;
clc;
close all;
clear all;
count=1;
for x=0:5:360
    sin=sinx(x);
    cos=cosx(x);
    tan=tanx(x);
    fprintf('\nsin(%5.1f)=%12.8f cos(%5.1f)=%12.8f tan(%5.1f)=%12.8f',x,sin,x,cos,x,tan);
    count=count+1;
    r=mod(count,20);
    if r==0
        choice=input('\nPress enter key to continue-->');
        clc;
    end
end