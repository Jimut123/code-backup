#write shell script to input number of students 'x' where x>=1 and x<=20. Input roll,name,cia-marks(0-20),final_marks(0-80)of 'x' students. calculate total_marks=cia_marks+final_markks.
#calculate Division as follows:
# if total_marks >= 60 division="1st"
# if total_marks >= 45 and <60 division="2nd"
# if total_marks >= 35 and <45 division="3rd"
# if total_marks <35 division="fail"
#Print roll,name,total_marks,division of all 'n' students.
clear
echo -n "Enter number of students(1-10)="
read n
echo "Enter Roll, name,cia,final of $n students--->"
c=1
	while [ $c -le $n ]
	do
	echo -n "Roll[$c]="
	eval read r$c
	echo -n "Name[$c]="
	eval read name$c
	echo -n "Cia[$c]="
	eval read cia$c
	echo -n "Final[$c]="
	eval read final$c
	c=`expr $c +1`
	done
#to calculate
c=1
	while [ $c -le $n ]
	do
	eval c1=\$cia$c
	eval f1=\$f1nal$c
	eval tot$c=`expr $c1 + $f1`
	c=`expr $c + 1`
	done
#to calculate division
c=1
	while [ $c -le $n ]
	do
	
	if [  ]	
	
