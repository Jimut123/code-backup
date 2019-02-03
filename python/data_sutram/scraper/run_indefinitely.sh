#!/bin/bash
while true
do
	if [[ ! $(pgrep -f scrapWords.py) ]]; then
    		python scrapWords.py
	fi
done
