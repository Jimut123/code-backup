	#q2nas3.awk : Write a program to calculate sin(x),cos(x),tan(x)
	#using Taylor series expansion
	BEGIN{
	count=0
	system("clear")
		for(x=0;x<=360;x=x+5){
		count++
		xrad=x*3.141592653589793/180
		csin=xrad
		psin=1
		eps=csin-psin
			if(eps<0){
			eps=-eps
			}
		n=3
		sf=-1
			while ( eps > 1e-16){
			psin=csin
			fact=1
			xp=1
				for(i=1;i<=n;i++){	
				fact=fact*i
				xp=xp*xrad
				}
			csin=csin+sf*xp/fact
			eps=csin-psin
				if(eps<0){
				eps=-eps
				}
			n=n+2
			sf=-sf
			}
		
		#To calculate cos(x)
		ccos=1
		pcos=0
		eps=ccos-pcos
			if(eps<0){
			eps=-eps
			}
		n=2
		sf=-1
			while ( eps > 1e-16){
			pcos=ccos
			fact=1
			xp=1
				for(i=1;i<=n;i++){	
				fact=fact*i
				xp=xp*xrad
				}
			ccos=ccos+sf*xp/fact
			eps=ccos-pcos
				if(eps<0){
				eps=-eps
				}
			n=n+2
			sf=-sf
			}
		
		# To calculate tan(x)
		ctan=csin/ccos	
   printf "sin(%3d)=%8.5f Cos(%3d)=%8.5f tan(%3d)=%16.5f\n",x,csin,x,ccos,x,ctan
			if((count%15)==0){
			printf "Press enter key to continue--->"
			getline ch < "/dev/tty"
			system("clear")
			}
		}
	}
