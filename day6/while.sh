#!/bin/bash -x
counter=1
number=10
while [ $counter != $number ]
do
           echo "$counter"
           ((counter++))
done
