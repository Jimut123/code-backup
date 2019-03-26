clc;
clear all;
close all;

n(1)=123;
n(2)=246;
n(3)=369;

while n(3)<1000
    flag=1;
    for i=1:9
        f(i)=0;
    end
    for i=1:3
        copy=n(i);
        dighun=floor(copy/100);
        copy=mod(copy,100);
        digten=floor(copy/10);
        digone=mod(copy,10);
        if dighun~=0 && digone~=0 && digten~=0
            f(dighun)=f(dighun)+1;
            f(digten)=f(digten)+1;
            f(digone)=f(digone)+1;
        end
    end
    for i=1:9
        if f(i)~=1
            flag=0;
        end
    end
    if flag==1
        fprintf('[%d,%d,%d]\n',n(1),n(2),n(3));
    end
    n(1)=n(1)+1;
    n(2)=n(1)*2;   
    n(3)=n(1)*3;   
end
