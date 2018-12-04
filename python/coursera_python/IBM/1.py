import requests
wikipedia_link='https://en.wikipedia.org/wiki/Special:Random'
raw_random_wikipedia_page = requests.get(wikipedia_link)
page = raw_random_wikipedia_page.text
f1 = page.find('<title>')
f2 = page.find('</title>')
title_string = page[f1+7:f2]
print(title_string)
img=display_cover(top='top',bottom='bottom')
img.save('sample-out.png')
IPythonImage(filename='sample-out.png')
