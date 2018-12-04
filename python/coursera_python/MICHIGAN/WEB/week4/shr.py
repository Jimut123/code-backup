import urllib2
from bs4 import BeautifulSoup

page = urllib2.urlopen(raw_input("Enter URL: "))
soup = BeautifulSoup(page, "html.parser")

spans = soup('span')

numbers = []

for span in spans:
    numbers.append(int(span.string))

print sum(numbers)
