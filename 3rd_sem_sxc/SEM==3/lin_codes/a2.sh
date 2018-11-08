#input a,b,c calculate and print largest number, smallest number 
clear
echo -n "Input value of a--->"
read a
echo -n "Input value of b--->"
read b
echo -n "Input value of c--->"
read c
max=$a
min=$c
#For largest number---->
if [ $b -gt $max ]
	then
	max=$b
fi
if [ $c -gt $max ]
	then
	max=$c
fi
#For smallest number----->
if [ $a -lt $min ]
	then
	min=$a
fi
if [ $b -lt $min ]
	then
	min=$b
fi
echo
echo "The largest number is --> $max smallest number is ---> $min"
#End