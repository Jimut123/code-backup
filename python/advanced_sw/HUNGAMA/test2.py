color_list = ['\033[1;30m','\033[1;31m','\033[1;32m','\033[1;33m','\033[1;34m','\033[1;35m','\033[1;36m','\033[1;37m','\033[1;38m']
import random
k = 9

ran = int(random.random()*k)
print(color_list[ran],"This is a text")
