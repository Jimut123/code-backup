#!/bin/bash
while true
do
	if [[ ! $(pgrep -f test.py) ]]; then
    		python test.py
	fi
done
