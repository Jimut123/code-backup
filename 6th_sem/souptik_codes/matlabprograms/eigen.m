clc;
clear all;
close all;


n=input('Enter Matrix Dimension');

for i=1:n
    for j=1:n
        a(i,j)=input('Enter Element');
    end
end
flag=1;
tanval=1
itrr=0;


for i=1:n
    for j=1:n
        if i==j
            e(i,j)=1;
        else
            e(i,j)=0;
        end
    end
end


while flag==1&&tanval~=0
itrr=itrr+1;
flag=0;
a
max=0;
sti=0;
stj=0;
for i=1:n
    for j=1:n
        if i~=j
            if abs(a(i,j))>max
                max=abs(a(i,j));
                sti=i;
                stj=j;
            end
        end
    end
end
max
sti
stj
tanval=1;
if a(sti,sti)>=a(stj,stj)
    tanval=2*a(sti,stj);
    tanval=tanval/(a(sti,sti)-a(stj,stj)+sqrt((a(sti,sti)-a(stj,stj))*(a(sti,sti)-a(stj,stj))+4*a(sti,stj)*a(sti,stj)));
else
    tanval=2*a(sti,stj);
    tanval=tanval/(a(sti,sti)-a(stj,stj)-sqrt((a(sti,sti)-a(stj,stj))*(a(sti,sti)-a(stj,stj))+4*a(sti,stj)*a(sti,stj)));
end
cosval=1;
cosval=1/sqrt(1+(tanval*tanval));
sinval=1;
sinval=tanval*cosval;

tanval
cosval
sinval
%creating s matrix
for i=1:n
    for j=1:n
        if i==j
            s(i,j)=1;
        else
            s(i,j)=0;
        end
    end
end

s(sti,sti)=cosval;
s(stj,stj)=cosval;
s(stj,sti)=sinval;
s(sti,stj)=-sinval;
s

st=s';
st

t=a*s;
a=st*t;

a

for i=1:n
    for j=1:n
        if i~=j
            if abs(a(i,j))>=1e-06
                flag=1;
            end
        end
    end
end
flag

e=e*s;
end
itrr

for i=1:n
    for j=1:n
        if i~=j
            a(i,j)=0;
        end
    end
end


a

e




