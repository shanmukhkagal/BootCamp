#!/bin/bash -x
ispresent=1
randomCheck=1
randomCheck=$((RANDOM%2))
if [ $ispresent -eq $randomCheck ]
then
        empRatePerHr=20
        empWorkingHr=8
        salary=$(($empRatePerHr -eq $randomCheck))
                     echo "$salary"
else
                     echo "enter salary equal to 0"
fi

 
