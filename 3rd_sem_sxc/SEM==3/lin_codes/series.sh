#s1=1-2+3-4+....n
#s2=(1)+(1+2)+(1+2+3)+(1+2+3+4)+....(1+2+3+4+5+...n)
clear
echo -n "Enter the value of n---->"
read n
i=1
#Series One
s1=0
s2=0
while [ $i -le $n ]
do
	s=`expr $i % 2`
	if [ $s -eq 0 ]
		then
		s1=`expr $s1 - $i`
	else
		s1=`expr $s1 + $i`
	fi
	i=`expr $i + 1`
done
echo "s1=$s1"
#Series Two
i=1
s1=0
s2=0
while [ $i -le $n ]
do
	s1=`expr $s1 + $i`
	s2=`expr $s2 + $s1`
	i=`expr $i + 1`
done
echo "s2=$s2"