clc;
clear all;
close all;

n=input('Enter number of words');

for i=1:n
    word=input('Enter element','s');
    l=length(word(1,:));
    for j=1:l
        a(i,j)=word(1,j);
    end
end
a
for i=1:n-1
    for j=1:n-i
        if strcmpp1(a(j,:),a(j+1,:))==1
            t=a(j,:);
            a(j,:)=a(j+1,:);
            a(j+1,:)=t;
        end
    end
end
a