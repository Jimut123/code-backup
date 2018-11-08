	#q2as3.awk : Write a program in awk to calculate (i)sin(x), cos(x)
	# and (iii)tan(x) using Taylor series expansion
	BEGIN{
	system("clear")
	count=0
		for(x=0;x<=360;x=x+5){
		count++
		xrad=x*3.141592653589793/180
		#To calculate sin(x)
		csin=xrad
		psin=1
		eps=csin-psin
			if(eps<0){
			eps=-eps
			}
		n=3
		sf=-1
			while(eps > 1e-16){
			psin=csin
			xp=1
			fact=1
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
			while(eps > 1e-16){
			pcos=ccos
			xp=1
			fact=1
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
		#To calculate tan(x)
		ctan=csin/ccos
  printf "Sin(%3d)=%10.7f Cos(%3d)=%10.7f Tan(%3d)=%16.4f\n",x,csin,x,ccos,x,ctan
			if((count % 20)==0){
			printf "\nPress enter key to continue--->"
			getline choice < "/dev/tty"
			system("clear")
			}
		}
	}

			

