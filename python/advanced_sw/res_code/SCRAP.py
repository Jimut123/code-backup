import sqlite3
import wget

conn = sqlite3.connect('music.sqlite')
cur = conn.cursor()

cur.executescript('''
CREATE TABLE IF NOT EXISTS data (
    i   INTEGER,
    url  TEXT UNIQUE PRIMARY KEY
);
''')


track1 = 'http://mp3l.jamendo.com/?trackid='
track2 = '&format=mp31&from=app-97dab294'


i1 = cur.execute(''' SELECT MAX(i) FROM data ''')
i = cur.fetchone()[0]


print(i)
if i == None:
    i=111111
d=0
while(1):
    url =track1+str(i)+track2
    i=i+1
    print(url)
    try:
        filename = wget.download(url)
        cur.execute('''INSERT OR IGNORE INTO data (i, url)
					VALUES ( ?, ? )''', ( i,url, ))
        d=d+1
        if d%5==0 :
            conn.commit()
    except:
        print("Blown off url : ",url)
        continue


