#!/bin/bash
echo  "Enter a first num:"
read num1
echo  "Enter a second num:"
read num2

for (( count1=num1;  count1<num2; count1++ ))
do
    result=1
   for (( count2=2; count2<count1; count2++ ))
   do
     if [ $(($count1%$count2))  -eq 0 ]
     then
         result=$(($result+1))
     fi
    done

     if [ $result -eq 1 ]
        then
        echo "Prime numbers between range is :$count1"
     fi
done
