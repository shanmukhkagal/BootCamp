s#!/bin/bash
bash: !/bin/bash: event not found
sounds[dog]="bark"
sounds[bird]="tweet"
sounds[cow]="moo"
sounds[wolf]="howl"

echo ${sounds[@]}

echo "dog sounds "${sounds[dog]}
echo ${#sounds[@]}

echo ${!sounds[@]}

for keys in ${!sounds[@]}
do
     echo $keys=${sounds["$keys"]}
done
