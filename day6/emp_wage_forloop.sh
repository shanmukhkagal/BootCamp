#!/bin/bash -x 
isPartTime=2
isFullTime=1
totaSalary=0
empRatePerHr=20
totalWorkingDays=20
for (( day=1; day<=$totalWorkingDays; day++ ))
do 
         empCheck=$(( RANDOM%3 ))
         case $empCheck in
                       $isFullTime)
                               empHrs=8
                                 ;;
                       $isPartTime)
                                empHrs=4
                                  ;;
                           *)
                                empHrs=0
                                  ;;
         esac 
          salary=$(($empHrs*$empRatePerHr)) 
          totalSalary=$(($totalSalary+$salary))
done
