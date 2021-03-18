#!/bin/bash -x
ispresent=0
randomCheck=$((RANDOM%2))
if [ $ispresent -eq $randomCheck ]
then 
         echo "employee is present"
else
          echo "empoyee is absent"
fi
