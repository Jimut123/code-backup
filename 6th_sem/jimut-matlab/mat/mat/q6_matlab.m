clc;
format short;
%clear all;
close all;
%a = round(rand(1,20)*100);
a = [];
sum=0;
for i=1:5
    a(i)=input('Enter number :');
    sum=sum+a(i);
end
avg=sum/5;
max=a(1);
dif = 0;
for i=1:5
    if(a(i)>max)
        max=a(i);
    end
    dif=dif+(a(i)-avg)^2;
end
sd = (dif/5)^0.5;

fprintf('Sum = %d || Avg = %d || Max = %d || sd = %1.3f',sum,avg,max,sd);

