function[]=sort1(a,n)
    for i=1:n
        for j=i+1:n
            if a(i,:)>a(j,:)
                temp=a(i,:);
                a(i,:)=a(j,:);
                a(j,:)=temp;
            end
            fprintf('\n After Pass : %s ',i);
            for k=1:n
                fprintf('\n %s',a(k,:))
            end
        end
    end
end

    
        
    
            