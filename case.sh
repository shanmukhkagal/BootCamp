#!/bin/bash  -x
isFullTime=1
isPartTime=2
randomCheck=$((RANDOM%3))
if [ $isFullTime -eq $randomCheck ]
then
        employeeWorkingHr=8
        empRatePerHr=20
         salary=$(($empRatePerHr*$employeeWorkingHr))
         echo "emlployee working hr is 8 and $salary"

elif [ $isPartTime -eq $randomCheck ]
then

        employeeWorkingHr=4
        empRatePerHr=20
        salary=$(($empRatePerHr*$employeeWorkingHr))


               echo "emlployee working hr is 4 and $salary"

