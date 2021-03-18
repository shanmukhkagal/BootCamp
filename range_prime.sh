#!/bin/bash -x
echo "enter a first number"
read num1
echo "enter a second number"
read num2

for(( counter1=num1; counter1<num2; counter1++ ))
do
for(( counter2=2; counter2<counter1; counter2++ ))
do	
    result=1
    temp=$(($counter1%$counter2))
    if [ $temp -eq 0 ]
    then
      result=$(($result+1))
    fi
done

if [ $result -eq 1 ]
then
       echo "prime numbers between range is: $counter1"
fi
done
