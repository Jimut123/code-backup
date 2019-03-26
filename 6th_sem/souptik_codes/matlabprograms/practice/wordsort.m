clc;
clear all;
close all;
%lmdfgxlkndsfknsf
n=input('Enter number of words');%dskfgkjsdnhfghkjs

for i=1:n
    a(i,:)=input('Enter word','s');
end
%mdsfjnhsakjfaikjdh
a

for i=1:length(a(1,:))
    f(i)=0;
end
%hdfkjghsakdfbsakjd
for i=1:n-1
    for j=1:n-i
        if strcmp1(a(j,:),a(j+1,:))==1
            t=a(j,:);
            a(j,:)=a(j+1,:);
            a(j+1,:)=t;
        end
    fprintf('Intermediate Step : \n')
    a
    end
end

a