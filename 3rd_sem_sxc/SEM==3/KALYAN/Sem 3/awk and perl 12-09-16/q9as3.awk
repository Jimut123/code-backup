	#q9as3.awk : Write a program to convert number to words
	BEGIN{
	system("clear")
	a[1]="One"
	a[2]="Two"
	a[3]="Three"
	a[4]="Four"
	a[5]="Five"
	a[6]="Six"
	a[7]="seven"
	a[8]="Eight"
	a[9]="Nine"
	a[10]="Ten"
	a[11]="Eleven"
	a[12]="Twelve"
	a[13]="Thirteen"
	a[14]="Fourteen"
	a[15]="Fifteen"
	a[16]="Sixteen"
	a[17]="Seventeen"
	a[18]="Eighteen"
	a[19]="Nineteen"
	b[2]="Twenty"
	b[3]="Thirty"
	b[4]="Forty"
	b[5]="Fifty"
	b[6]="Sixty"
	b[7]="Seventy"
	b[8]="Eighty"
	b[9]="Ninety"
		while(1){
		printf "\nEnter lower limit(1-9999999)="
		getline n1 < "/dev/tty"
		printf "Enter upper limit(1-9999999)="
		getline n2 < "/dev/tty"
		if(n1<1 || n1>9999999 || n2<1 || n2>9999999 || n1>n2){
		print "***Invalid data. Try gain.***"
		}
		else{
		break
		}
		}
	count=0
		for(i=n1;i<=n2;i++){
		n=i
		nlkh=int(n/100000)
			if(nlkh<=19){
			nlkh1=0
			nlkh2=nlkh
			}
			else{
			nlkh1=int(nlkh/10)
			nlkh2=nlkh % 10
			}

		n=n % 100000
		nth=int(n/1000)
			
			if(nth<=19){
			nth1=0
			nth2=nth
			}
			else{
			nth1=int(nth/10)
			nth2=nth % 10
			}
		n=n % 1000
		nh=int(n/100)
		n=n % 100
			
			if(n<=19){
			nt1=0
			nt2=n
			}
			else{
			nt1=int(n/10)
			nt2=n % 10
			}
		# To print number to words
		printf "%-7d :",i
			if(nlkh1 !=0 && nlkh2 !=0){
			printf "%s %s Lakh ",b[nlkh1],a[nlkh2]
			}
			else if(nlkh1 !=0 && nlkh2==0){
			printf "%s Lakh ",b[nlkh1]
			}
			else if(nlkh1==0 && nlkh2 !=0){
			printf "%s Lakh ",a[nlkh2]
			}
			
			if(nth1 !=0 && nth2 !=0){
			printf "%s %s Thousand ",b[nth1],a[nth2]
			}
			else if(nth1 !=0 && nth2==0){
			printf "%s Thousand ",b[nth1]
			}
			else if(nth1==0 && nth2 !=0){
			printf "%s Thousand ",a[nth2]
			}

			if(nh !=0 ){
			printf "%s Hundred ",a[nh]
			}
			
			if(nt1 !=0 && nt2 !=0){
			printf "%s %s",b[nt1],a[nt2]
			}
			else if(nt1 !=0 && nt2==0){
			printf "%s",b[nt1]
			}
			else if(nt1==0 && nt2 !=0){
			printf "%s",a[nt2]
			}
		printf "\n"
		count++
			if((count % 15)==0){
			printf "\nPress Enter key to continue--->"
			getline choice < "/dev/tty"
			system("clear")
			}
		}
	}




			










			


























	
