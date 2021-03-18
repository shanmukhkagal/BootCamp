 #!bin/bash -x
echo "enter a 3 digit value" 
read -p "enter num1:"x
max=$x
min=$x
read -p "enter num2:"y
if [ $y -gt $max ]
then
      max=$y
fi
if [ $y -lt $min ]
then
     min=$y
fi
read -p "enter num3:"z
if [ $z -gt $max ]
then
     max=$z
fi

if [ $z -lt $min ]
then 
     min=$z
fi

read -p "enter num4:"a
if [ $a -gt $max ]
then
     max=$a
fi

if [ $a -lt $min ]
then 
     min=$a
fi

read -p "enter num5:"b
if [ $b -gt $max ]
then
     max=$b
fi

if [ $b -lt $min ]
then 
     min=$b
fi


echo "$max is the greatest number"

echo "$min is the smallest number"
