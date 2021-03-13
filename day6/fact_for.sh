#!/bin/bash
echo "enter a number:"
read num1
result=1

for (( num=1; num<=$num1; num++ ))
do

    result=$(( $result*$num ))
done


echo "factorial of a number is:$result"

