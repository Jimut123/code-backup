clc;
clear all;
close all;


n=input('Enter number of words');


for i=1:n
    a(i,:)=input('Enter word','s');
end


a


for i=1:n-1
    for j=1:n-i
        for k=1:length(a(1,:))
            if a(j,k)>a(j+1,k)
                t=a(j,:);
                a(j,:)=a(j+1,:);
                a(j+1,:)=t;
                break;
            end
        end
    end
end

a