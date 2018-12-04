import sqlite3

conn = sqlite3.connect('test.sqlite')

cur = conn.cursor()

# some commands
cur.execute('''
CREATE TABLE IF NOT EXISTS Text 
(
        id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
        name TEXT UNIQUE
);

''')

hand = open('a.txt')
#list_=[]
#sum=0
for line in hand:
	line = line.rstrip()
        #y = re.findall('[0-9]+',line)
        #print(y)       # prints the list
        #for i in y:
                #sum=sum+int(i)
	wrd = line.split()
	for word in wrd:
		cur.execute('''INSERT OR IGNORE INTO Text(name) VALUES(?)''',(word,))
conn.commit()
#print(list_)
#print(sum)

