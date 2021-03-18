
#!/bin/bash -x
read -p "enter the value of var1" var1
read -p "enter the value of var2" var2
if [ $var1 -ge $var2 ]
then 
     echo "$var1 is greater than or equal to $var2"
else
     echo "$var2 is greater than $var1"
fi
