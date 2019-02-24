x = 0:pi/100:2*pi;
y = sin(x);
plot(x,y)

hold on

y2 = cos(x);
plot(x,y2,':')

#hold on

#y3 = tanh(x)
%plot(x,y3,':')

legend('sin','cos')#,'tanh')


hold off