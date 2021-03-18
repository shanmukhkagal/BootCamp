#!/bin/bash -x
read -p "enter the 1st random digit" a
read -p "enter the 2nd random digit" b
read -p "enter the 3rd random digit" c
read -p "enter the 4th random digit" d
read -p "enter the 5th random digit" e
sum=$(( $a + $b + $c + $d + $e ))
average=$(( $sum/5 ))
          echo "$sum"
          echo "$average"
