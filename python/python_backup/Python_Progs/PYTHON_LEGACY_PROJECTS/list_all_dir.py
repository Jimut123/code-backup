from os import listdir
from os.path import isfile,join

files_list=[f for f in listdir('/root/Python_Progs')if isfile(join('/root/Python_Progs',f))]
print(files_list)