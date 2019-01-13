%function number_to_words(n) : Function to convert number to words
function number_to_words(n)
a=['One      ';'Two      ';'Three    ';'Four     ';'Five     ';'Six      ';'Seven    ';'Eight    ';'Nine     ';
     'Ten      ';'Eleven   ';'Twelve   ';'Thirteen ';'Fourteen ';'Fifteen  ';'Sixteen  ';'Seventeen';
     'Eighteen ';'Nineteen '];
 b=['Zero   ';'Twenty ';'Thirty ';'Forty  ';'Fifty  ';'Sixty  ';'Seventy';'Eighty ';'Ninety '];
fprintf('%d :',n);
% To extract all digits from n
nlkh=fix(n/100000); % extracting digits from lakh place
if nlkh<=19
    nlkh1=0;
    nlkh2=nlkh;
else
    nlkh1=fix(nlkh/10);
    nlkh2=mod(nlkh,10);
end
n=mod(n,100000);
nth=fix(n/1000);
if nth<=19
    nth1=0;
    nth2=nth;
else
    nth1=fix(nth/10);
    nth2=mod(nth,10);
end
n=mod(n,1000);
nh=fix(n/100);
n=mod(n,100);
if n<=19
    nt1=0;
    nt2=n;
else
    nt1=fix(n/10);
    nt2=mod(n,10);
end
% To print number in words
if nlkh1 ~=0 && nlkh2~=0
    fprintf('%s %s Lakh ',b(nlkh1,:),a(nlkh2,:));
elseif nlkh1 ~=0 &&  nlkh2==0
    fprintf('%s Lakh ',b(nlkh1,:));
elseif nlkh1==0 && nlkh2 ~=0
    fprintf('%s Lakh ',a(nlkh2,:));
end

if nth1 ~=0 && nth2~=0
    fprintf('%s %s Thousand ',b(nth1,:),a(nth2,:));
elseif nth1 ~=0 &&  nth2==0
    fprintf('%s Thousand ',b(nth1,:));
elseif nth1==0 && nth2 ~=0
    fprintf('%s Thousand ',a(nth2,:));
end

if nh ~=0
    fprintf('%s Hundred ',a(nh,:));
end

if nt1 ~=0 && nt2~=0
    fprintf('%s %s ',b(nt1,:),a(nt2,:));
elseif nt1 ~=0 &&  nt2==0
    fprintf('%s ',b(nt1,:));
elseif nt1==0 && nt2 ~=0
    fprintf('%s ',a(nt2,:));
end
fprintf('\n');

end
