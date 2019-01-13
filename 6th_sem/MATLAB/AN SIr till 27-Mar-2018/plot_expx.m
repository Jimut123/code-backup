%plot expx() function
clc;
close all;
clear all;
j=1;
    for i=0:.1:5
        y(j)=expx(i);
        j=j+1;
    end
    plot(y);
    %end of program