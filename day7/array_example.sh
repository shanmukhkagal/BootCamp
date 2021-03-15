#!/bin/bash
declare -a Fruits
Fruits[0]="apple"
Fruits[1]="banana"
Fruits[2]="orange"

#to print all element of array
echo ${Fruits[@]}

#to access particular element
echo ${Fruits[1]}

#to get length of an array or count element present in array
echo ${#Fruits[@]}

#to iterate elements of an array sequencially
for elements in ${Fruits[@]}
do 
         echo $elements
done

#to delete element from an array
unset Fruits[2]
echo ${Fruits[@]}

#to search and replace element from an array
echo ${Fruits[@]//banana/mango}
