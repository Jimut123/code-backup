# socketTest.py

import socket

mysocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
mysocket.connect(('http://data.pr4e.org/intro-short.txt', 80))
mysocket.send('GET intro-short.txt HTTP/1.0\n')
mysocket.send('Host: www.pythonlearn.com\n\n')
# mysocket.send(b'GET http://www.pythonlearn.com/code/intro-short.txt HTTP/1.1 Host: www.pythonlearn.com Proxy-Connection: keep-alive Cache-Control: max-age=0 Upgrade-Insecure-Requests: 1 User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36 Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8 Accept-Encoding: gzip, deflate, sdch Accept-Language: zh-CN,zh;q=0.8,en;q=0.6 Cookie: __cfduid=da807f472bbfb5777530c786a56bc13491472801448 If-None-Match: W/"1d3-521e9853a392b" If-Modified-Since: Mon, 12 Oct 2015 14:55:29 GMT')
# mysocket.connect(('www.py4inf.com', 80))
# mysocket.send('GET http://www.py4inf.com/code/romeo.txt HTTP/1.0\n\n')


while True:
	data = mysocket.recv(512)
	if(len(data) < 1):
		break
	print(data)

mysocket.close()
