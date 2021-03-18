#!/bin/bash -x
randomDigit1=$((RANDOM%2))
randomDigit2=$((RANDOM%2))

       result=$(( $randomDigit1 + $randomDigit2 ))
                   echo "$result"
