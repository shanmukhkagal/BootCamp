#!/bin/bash -x
echo "enter a number"
read number
if [ $number -eq  1 ]
then 
        echo "unit"
elif [ $number -eq 10 ]
then 
        echo "ten"
elif [ $number -eq 100 ]
then
        echo "hundread"
elif [ $number -eq 1000 ]
then
        echo "thousand"
elif [ $number -eq 2000 ]
then
        echo "two thousand"
elif [ $number -eq 3000 ]
then
        echo "three thousand"
elif [ $number -eq 4000 ]
then
        echo "four thousand"
elif [ $number -eq 5000 ]
then
        echo "five thousand"
elif [ $number -eq 6000 ]
then
        echo "six thousand"
elif [ $number -eq 7000 ]
then
        echo "seven thousand"
elif [ $number -eq 8000 ]
then
        echo "eight thousand"
elif [ $number -eq 9000 ]
then
        echo "nine thousand"
elif [ $number -eq 10000 ]
then
        echo "ten thousand"
else
        echo "elven thousand"
fi

