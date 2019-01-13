%funtion [eval,evec,n]=jacobi[a,n]
% Function to solve eigen value equation
%using Jacobi method.
function [eval,evec,n]=jacobi(a,n)
flag=1;
for i=1:n
    for j=1:n
        if i==j
            sn(i,j)=1;
        else
            sn(i,j)=0;
        end
    end
end
[i,j]=maximum(a,n);
while abs(a(i,j))>1e-06
    
    %To form s1 matrix
    for i=1:n
        for j=1:n
            if i==j
                s1(i,j)=1;
            else
                s1(i,j)=0;
            end
        end
    end
        % To find tantheta
  if a(i,i) >=a(j,j)
      d1=(a(i,i)-a(j,j))+sqrt((a(i,i)-a(j,j))^2+4*a(i,j)^2);
     tantheta=2*a(i,j)/d1;
  else
      d1=(a(j,j)-a(i,i))+sqrt((a(i,i)-a(j,j))^2+4*a(i,j)^2);
      tantheta=-2*a(i,j)/d1;
  end
  costheta=1/sqrt(1+tantheta^2);
  sintheta=costheta*tantheta;
  s1(i,i)=costheta;
  s1(j,j)=costheta;
  s1(i,j)=-sintheta;
  s1(j,i)=sintheta;
  s1t=s1';
  as1=a*s1;
  s1tas1=s1t*as1;
  a=s1tas1;
  [i,j]=maximum(a,n);
  sn=sn*s1;
  end
    for i=1:n
    eval(i)=a(i,i);
    fprintf('Eigen Value(%d)=%6.2f\n',i,eval(i));
    end
    for i=1:n
        for j=1:n
        evec(i,j)=sn(i,j);
        end
    end
   end