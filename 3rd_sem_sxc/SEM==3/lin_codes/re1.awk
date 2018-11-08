#write a program in awk to calculate the value of
#pi=(3)^(1/2)*2*(1-(1/(3*3))+(1/(3^2*5))-(1/(3^3*7))...)
BEGIN{
system("clear")
cpi=1
ppi=0
eps=cpi-ppi
p3=1
n=3
sf=-1
		while(eps>1e-17){
		ppi=cpi
		p3=p3*3
		cpi=cpi+sf/(n*p3);
		eps=cpi-ppi
			if(eps<0){
			eps=-eps			
			}
		n=n+2
		sf=-sf
		}
	cpi=2*sqrt(3)*cpi
	printf("Value of pi=%16.14f\n",cpi);
}
#end of program
