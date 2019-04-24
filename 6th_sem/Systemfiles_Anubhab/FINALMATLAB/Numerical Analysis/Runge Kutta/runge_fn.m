%function [y]=runge4(x0,y0,h) : Function to solve differential equation 
%using 4-th order runge kutta method
function [y]=runge4(x0,y0,h)
k1=h*y0;
k2=h*(y0+k1/2);
k3=h*(y0+k2/2);
k4=h*(y0+k3);
y=y0+1/6*(k1+2*k2+2*k3+k4);
end
