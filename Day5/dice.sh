#!/bin/bash -x
randomDiceNumber=$((RANDOM%7))
if [ $randomDiceNumber -ne 0 ]
then
      echo "$randomDiceNumber"
fi

