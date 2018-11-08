#SLAB Calculation of Grade--->
clear
echo -n "Enter the bumber of students(1-20)--->"
read n
i=1
while [ $i -le $n ]
do
echo -n "Enter roll-->"
read r 
echo -n "Enter total-->"
read t 
if [ $t -ge 70 ]
	then
	g="A"
elif [ $t -ge 60 ]
	then
	g="B"
elif [ $t -ge 50 ]
	then
	g="C"
elif [ $t -ge 40 ]
	then
	g="D"
else
	g="F"
fi
i=`expr $i + 1`
echo 
echo "Roll-->$r Total-->$t Grade-->$g"
echo
done
#end