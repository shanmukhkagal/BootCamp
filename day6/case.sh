#!/bin/bash
echo "read a number"
read number
case $number in
       1) echo "UNIT"
            ;;
       10)
          echo  "TEN"
            ;;
       100)
           echo "hUNDREAD"
            ;;
       1000) 
           echo "ThOUSAND"
            ;;
       10000)
             echo "TEN ThOUSAND"
            ;;
       100000)
              echo "ONE LAC"
            ;;
esac
        
