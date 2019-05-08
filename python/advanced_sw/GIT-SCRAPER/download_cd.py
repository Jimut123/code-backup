import os
import wget
cur_wd = os.getcwd()
import json
from pprint import pprint

with open('raw_git.json') as f:
    data = json.load(f)

#pprint(data)

for item in data:
    #print(item)
    if data[item] != '':
        dir_ = item.split('/')[:-1]
        go_dir = '/'.join(dir_)
        link_ = data[item]
        #print(go_dir,link_)
        if not os.path.exists(go_dir):
            os.makedirs(go_dir)
        os.chdir(go_dir)
        wget.download(link_)
        os.chdir(cur_wd)

        








