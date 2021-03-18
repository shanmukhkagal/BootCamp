#!/bin/bash -x 
echo "enter a number"
read number
if [ $number -eq 0 ]
then
       echo "sunday"
elif [ $number -eq 1 ]
then   
       echo "monday"
elif [ $number -eq 2 ]
then
       echo "tuesday"
elif [ $number -eq 3 ]
then
       echo "wednsday"
elif [ $number -eq 4 ]
then
       echo "thursday"
elif [ $number -eq 5 ]
then
       echo "friday"
elif [ $number -eq 6 ]
then
       echo "saturday"
else
       echo "month"
fi
