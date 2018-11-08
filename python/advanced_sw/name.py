import re
fname = 'Broken Arrows.mp3'
#fname = '23966328_b32_a2.mp4'
#fname = 'Kabhi Jo Baadal Barse.mp3'
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
string_cut = str_[pos_f-270:pos_f]
print(string_cut)
p = re.compile('[a-zA-Z]+')
list_n = p.findall(string_cut)

print(list_n)

list_n1 = []
for list_1 in list_n:
    if len(list_1) > 1:
       list_n1.append(list_1)

print(list_n1)

name_of_Song = ''
i = 0       # no of var of word you want to take in the song
for item in list_n1:
    if i < 8:       # can change the parameter
        name_of_Song = name_of_Song + str(item) + '_'
    i = i + 1

name_of_Song = name_of_Song[:len(name_of_Song)-1]
print(name_of_Song)

