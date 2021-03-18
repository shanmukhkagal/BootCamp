#!/bin/bash -x
echo "enter a single digit number"
read singeDigitNumber
if [ $singeDigitNumber -eq 0 ]
then 
      echo "zero"
elif [ $singeDigitNumber -eq 1 ]
then 
      echo "one"
elif [ $singeDigitNumber -eq 2 ]
then 
      echo "two"
elif [ $singeDigitNumber -eq 3 ]
then 
      echo "three"
elif [ $singeDigitNumber -eq 4 ]
then
      echo "four"
elif [ $singeDigitNumber -eq 5 ]
then
      echo "five"
elif [ $singeDigitNumber -eq 6 ]
then
      echo "six"
elif [ $singeDigitNumber -eq 7 ]
then
      echo "seven"
elif [ $singeDigitNumber -eq 8 ]
then
      echo "eight"
elif [ $singeDigitNumber -eq 9 ]
then
      echo "nine"
else
      echo "ten"
fi



 
