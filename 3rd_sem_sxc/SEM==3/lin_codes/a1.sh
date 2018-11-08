#to calculate a-b a+b a/b and a%b
clear
echo -n "Enter the value of a---->"
read a
echo -n "Enter the value of b---->"
read b
s=`expr $a - $b`
s1=`expr $a + $b`
s2=`expr $a / $b`
s3=`expr $a \* $b`
s4=`expr $a % $b`
echo
echo "$a + $b = $s1"
echo "$a - $b = $s"
echo "$a / $b = $s2"
echo "$a * $b = $s3"
echo "$a % $b = $s4"
#End of program