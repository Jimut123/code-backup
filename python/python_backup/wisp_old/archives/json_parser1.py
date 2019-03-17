import json

with open('secrets.txt', 'r') as f:
    array = json.load(f)
print(array)