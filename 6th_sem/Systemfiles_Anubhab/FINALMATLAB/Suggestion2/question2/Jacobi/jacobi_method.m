%function [eval,evec,n]=jacobi_method(a,n) : function to solve eigen value
%equation using Jacobi method
function [eval,evec,n]=jacobi_method(a,n)
% To define sn(,) matrix as identity matrix
    for i=1:n
        for j=1:n
            if i==j
                sn(i,j)=1;
            else
                sn(i,j)=0;
            end
        end
    end
    [ii,jj]=maximum_value(a,n);
    while abs(a(ii,jj)) > 1e-06
    % To contruct s1(,) matrix
        for i=1:n
            for j=1:n
                if i==j
                    s1(i,j)=1;
                else
                    s1(i,j)=0;
                end
            end
        end
        aiiii=a(ii,ii);
        ajjjj=a(jj,jj);
        aiijj=a(ii,jj);
        % To calculate tan(theta), cos(theta), sin(theta)
        if aiiii>=ajjjj
            num=2*aiijj;
            den=(aiiii-ajjjj)+sqrt((aiiii-ajjjj)^2+4*aiijj^2);
            tant=num/den;
        else
            num=-2*aiijj;
            den=(ajjjj-aiiii)+sqrt((aiiii-ajjjj)^2+4*aiijj^2);
            tant=num/den;
        end
        cost=1/sqrt(1+tant^2);
        sint=cost*tant;
        s1(ii,ii)=cost;
        s1(jj,jj)=cost;
        s1(ii,jj)=-sint;
        s1(jj,ii)=sint;
        s1t=s1'; % to calculate tanspose of s1
        a1=s1t*a;
        a2=a1*s1; 
        a=a2;
        sn=s1*sn; % To calculate eigen vector
        [ii,jj]=maximum_value(a,n);
    end
    % to extract eigen values
    for i=1:n
        eval(i)=a(i,i);
    end
    % To store eigen vectors
    for i=1:n
        for j=1:n
            evec(i,j)=sn(i,j);
        end
    end
    fprintf('\nEigen Values are--->\n');
        for i=1:n
            fprintf('Eigen_value(%d)=%7.5f\n',i,eval(i));
        end
        fprintf('\nEigen Vectors are--->\n');
        
        for i=1:n
            for j=1:n
                fprintf('%7.4f\t',evec(i,j));
            end
            fprintf('\n');
        end
 end

