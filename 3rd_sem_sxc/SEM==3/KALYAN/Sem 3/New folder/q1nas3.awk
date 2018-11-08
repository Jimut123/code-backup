	#q1nas3.awk : Write a program in awk to calculate exp(x)
	# for x=.1 to 2.0 in step of .1
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
			n++
			eps=ce-pe
			}
		printf "exp(%5.1f)=%12.9f\n",x,ce
		}
	}
	#end of program

