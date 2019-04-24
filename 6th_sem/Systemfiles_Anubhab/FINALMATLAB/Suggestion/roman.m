%function roman(n) : number to roman numerals
function roman(n)

sd=['I   ';'II  ';'III ';'IV  ';'V   ';'VI  ';'VII ';'VIII','IX  '];
dd=['X   ';'XX  ';'XXX ';'XL  ';'L   ';'LX  ';'LXX ';'LXXX';'XC  '];
td=['C   ';'CC  ';'CCC ';'CD  ';'D   ';'DC  ';'DCC ';'DCCC';'CM  '];
fd=['M  ';'MM ';'MMM'];
nth=fix(n/1000);
n=mod(n,1000);
nh=n/100;
n=mod(n,100);
nt=n/10;
nu=mod(n,10);
if nth ~=0
    fprintf('%s',fd(nth,:));
end
if nh~=0
    fprintf('%s',td(nh,:));
end
if nt~=0
    fprintf('%s',dd(nt,:));
end
if nu~=0
    fprintf('%s',sd(nu,:));
end
%end of function
end