#!/bin/bash 
isFirstDigit=0
isSecondDigit=1
isThridDigit=2
isFourthDigit=3
isFifthDigit=4
singleDigitNumber=$((RANDOM%5))
           case $singleDigitNumber in
                     $isFirstDigit) echo "zero"
                                ;;
         
                     $isSecondDigit) echo "one"
                                ;;
               
                     $isThirdDigit) echo "second"
                                ;;
                
                     $isFourthDigit) echo "Three"
                                ;;
                 
                     $isFifthDigit) echo "fourth"
                                ;;
            esac


