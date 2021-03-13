#!/bin/bash
echo "enter a num"
read num
result=1

for (( counter=2; counter<$num; counter++ ))
do
      if [ $(($num%$counter))  -eq 0 ]
      then 

               result=$(($result+1))
fi
done
if [ $result -eq 1 ]
then 
      echo "its a prime num"
else
      echo "its not a prime num"
fi












^G Help      ^O Write Out ^W Where Is  ^K Cut       ^T Execute   ^C Location
^X Exit      ^R Read File ^\ Replace   ^U Paste     ^J Justify   ^_ Go To Line

