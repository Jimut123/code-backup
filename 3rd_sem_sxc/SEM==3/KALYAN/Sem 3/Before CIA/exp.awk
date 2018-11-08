	#q1as3.awk : Write a program in awk to calculate exp(x)
	#where x=1. to x=2.0 in step of .1
	BEGIN{
	system("clear")
		for(i=1;i<=20;i++){
		x=i*.1
		ce=1
		pe=0
		eps=ce-pe
		n=1
		fact=1
		xp=1
			while(eps > 1e-16){
			pe=ce
			fact=fact*n
			xp=xp*x
			ce=ce+xp/fact
			eps=ce-pe
			n=n+1
			}
		printf "exp(%5.1f)=%14.10f\n",x,ce
		}
	}
	#end of program




	
