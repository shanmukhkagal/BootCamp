#!/bin/bash -x
randomCheck=$((RANDOM%2))
if [ $randomCheck -eq 0 ]
then 
       echo "head"
else
       echo "tail"
fi
