# To run this, you can install BeautifulSoup
# https://pypi.python.org/pypi/beautifulsoup4

# Or download the file
# http://www.py4e.com/code3/bs4.zip
# and unzip it in the same directory as this file
import sqlite3

conn = sqlite3.connect('wiki1.sqlite')
cur = conn.cursor()

cur.executescript('''

CREATE TABLE IF NOT EXISTS data (
    id     INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE,
    link   TEXT UNIQUE 
);

''')

i=1

url = cur.execute(" SELECT link FROM data where id = ?",(i,))
for u in url:
	print(u)
print(url)						
