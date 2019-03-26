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
        for k=1:length(a(1,:))
            if k==1
                if a(j,k)>a(j+1,k)
                    t=a(j,:);
                    a(j,:)=a(j+1,:);
                    a(j+1,:)=t;
                end
            else
                flag=1;
                for l=k-1:-1:1
                        if a(j,l)~=a(j+1,l)
                        flag=0;
                        end
                end
                if flag==1
                    if a(j,k)>a(j+1,k)
                    t=a(j,:);
                    a(j,:)=a(j+1,:);
                    a(j+1,:)=t;
                    end
                end
            end
        end
    fprintf('Intermediate Step : \n')
    a
    end
end

a