clc;
close all;
clear all;
file1=input('\n ENter Input Image File Name ','s');
f3=['2.jpg';'3.jpg';'4.jpg';'5.jpg';'6.jpg';'7.jpg';'8.jpg';'9.jpg';'1.jpg'];
x=imread(file1);
[r,c,d]=size(x);
y(1:r,1:c,1)=.2989*x(1:r,1:c,1)+.587*x(1:r,1:c,2)+.1140*x(1:r,1:c,3);
for i=1:r
    for j=1:c
        if y(i,j,1)>=127
            y(i,j,1)=255;
        else
            y(i,j,1)=0;
        end
    end
end
%imshow(y);
stc=0;
stc1=0;
flag=0;
check=0;
ind=1;
t=1;
i=1;
while i<=c
    flag=0;
    for j=1:r
        if y(j,i,1)==0
            stc=i;
            flag=1;
            break;
        end
    end
    if flag==1
        for k=stc:c
            for l=1:r
                check=l;
                if y(l,k,1)==0
                    stc1=k;
                    break;
                end
            end
            if check==r
                t=k-i;
                break;
            end
        end
        extract(1:r,1:stc1-stc+1,1)=y(1:r,stc:stc1,1);
        imshow(extract);
        imwrite(extract,f3(ind,:));
        ind=ind+1;
        if(ind==9)
            break;
        end
    end
    flag=0;
    i=i+t;
end

    
        
            
        