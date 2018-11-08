'''
Note :: some songs donot have JSON, cannot be downloaded! 
__author__ : Jimut Bahan Pal
__date__ : June 11 2018

'''
import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import datetime
import os
import sys
import argparse

if sys.version_info < (3, 0, 0):
	print("\n" + '\033[1;38m' + \
            "You need Python3 or later to run this script." + \
            '\033[1;m' + "\n")
	exit(1)
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE
def main():
	logo()
	ch='Y'
	while(1 and (ch == 'y'or ch == 'Y')):
		id1 = input('\nEnter  the song id :- ')			# The first url that is entered, required for ignition
		url = 'https://secure.hungama.com/newTwitter_Audio/audio/index-g.php?songid='+str(id1)
		#print(url)
		html = urllib.request.urlopen(url, context=ctx).read()	# html parser
		soup = BeautifulSoup(html, 'html.parser')
		#print(soup)
		heap = str(soup)
		heap1 = heap.split('\"')

		import wget

		try:
			link_needed = heap1[27]
		except:
			print("\nSorry! song cannot be downloaded!")
			print("\n\n\nCHECK YOUR INTERNET CONNECTION...")
			ch = input("\nContinue?(Y/y) : ")
			continue
		#print(link_needed)
		fin_link = str(link_needed)
		#print(fin_link)
		string_1 = fin_link.replace('&amp;h;','&h')
		string_2 = string_1.replace('&amp;track;','&track')
		string_3 = string_2.replace("\\","/")
		#print(" :: ",string_2)
		string_4 = string_3.replace("////","//")
		#print("final link ::  ",string_4)
		try:
			filename = wget.download(string_4)
			ch = input("\nContinue?(Y/y) : ")
		except:
			print("\nSorry! song cannot be downloaded!")
			print("\n\n\nCHECK YOUR INTERNET CONNECTION...")
			ch = input("\nContinue?(Y/y) : ")
			continue
	print("The current path : ",os.getcwd())
	path = os.getcwd()
	files = os.listdir(path)
	i = 1
	file_list = filter((lambda x: '.mp4' in x), os.listdir(path))
	for file in file_list:
		rename = name_of_song_fun(file)+ ".mp4"
		print("filename : ",file," converting to : ",rename)
		os.rename(os.path.join(path, file), os.path.join(path, rename))
	time_fin = time_('time')
	time_elap = global_start_t - time_fin
	print("total time elapsed : ", divmod(time_elap))
	print("\n\n\n\n\n\n\n... saving progress and quitting")
	print("#################################################################################################################################")
def time_(dum):
	timet = datetime.datetime.now().time()
	date = datetime.datetime.now().date()
	if dum == 'date':
		return date
	else:
		return timet
def logo():
	print("\n\n\n\n\n")
	date1 = time_('date')
	print("\t\t\t\tDate : ",date1)
	timet1 = time_('time')
	global_start_t = timet1
	print("\t\t\t\tTime : ",timet1)    
	hello = """
                                                                           NAME : hungama
       ,________________________PYTHON_3___SCRAPER_________________________________,
      [ ,.__.____,                                                                 ]
      |[_,, $,__+] (@)                     ,_____,                                 |
      |    |#|     ,~, ,,      ,, , ,  , , |((~))| Systems                         |
      |    |#|     [#] |^.    .^| |=|  |=|   '^'                                   |
      | .._|#|     |$| || '\// || |$'__'$|   |^|                                   |
      |  \%_./     [%] [_] '' [_] [..__..]   [*]   ---- Hungama Scraper            |
      [,__________________________________________________________________________,]
"""
	color_list = ['\033[1;30m','\033[1;31m','\033[1;32m','\033[1;33m','\033[1;34m','\033[1;35m','\033[1;36m','\033[1;37m','\033[1;38m','\033[1;41m','\033[1;42m','\033[1;43m','\033[1;44m','\033[1;45m','\033[1;45m','\033[1;46m','\033[1;47m',]
	end_c = '\033[1;m'
	import random
	k = 17
	ran = int(random.random()*k)
	print(color_list[ran] + hello + end_c)
def name_of_song_fun(i):
	import re    
	fname = i
	with open(fname, 'rb') as f:
		lines = [str(x.strip()) for x in f.readlines()]
	v=0
	for line in lines:
		tmp = line.strip().lower()
		if 'hungama.com' in tmp and v != 1:
			str_ = tmp
			v=1

	#print(str_.split('hungama.com'))
	pos_f = str_.find('hungama.com')
	string_cut = str_[pos_f-300:pos_f]
	print(string_cut)
	p = re.compile('[a-zA-Z]+')
	list_n = p.findall(string_cut)
	print(list_n)
	list_n1 = []
	for list_1 in list_n:
		if len(list_1) > 1 and "lb" not in list_1 and "too" not in list_1 and "xa" not in list_1 and "data" not in list_1 and "cmt" not in list_1 and "alb" not in list_1 and "lavf" not in list_1:
			list_n1.append(list_1) 
	print(list_n1)
	name_of_Song = ''
	i = 0       # no of var of word you want to take in the song
	for item in list_n1:
		if i < 11:       # can change the parameter
			name_of_Song = name_of_Song + str(item) + '_'
			i = i + 1
	name_of_Song = name_of_Song[:len(name_of_Song)-1]
	print(name_of_Song)
	return name_of_Song
global_start_t = time_('time')
if __name__ == "__main__":
    main()


