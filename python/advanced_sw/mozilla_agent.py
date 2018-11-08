from urllib.request import Request, urlopen

req = Request('http://www.cmegroup.com/trading/products/#sortField=oi&sortAsc=false&venues=3&page=1&cleared=1&group=1', headers={'User-Agent': 'Mozilla/5.0'})
webpage = urlopen(req).read()
