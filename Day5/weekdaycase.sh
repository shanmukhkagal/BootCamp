#!/bin/bash 
echo read a weekdays 
read weekdays
case  $weekdays in
    1) echo "sunday"
        ;;
    2) echo "monday"
        ;;
    3) echo "tuesday"
        ;;
    4) echo  "wensday"
        ;;
    5) echo "thursday"
        ;;
    6) echo "friday"
        ;;
    7) echo "saturday"
        ;;
esac
