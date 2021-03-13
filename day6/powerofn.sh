#!/bin/bash 
echo "enter a num"
read num

exp=2
result=1
while [ $result -le 256 ]
do
    echo "power table of the $num is:$result"

    result=$(($result*$exp))

done

    
