# Mechanize headless
import mechanize
from cookielib import CookieJar
import urllib
# Browser
br = mechanize.Browser()
# Cookie Jar
cj = cookielib.LWPCookieJar()
br.set_cookiejar(cj)
# Browser options
br.set_handle_equiv(True)
br.set_handle_gzip(True)
br.set_handle_redirect(True)
br.set_handle_referer(True)
br.set_handle_robots(False)
# Follows refresh 0 but not hangs on refresh > 0
br.set_handle_refresh(mechanize._http.HTTPRefreshProcessor(), max_time=1)
# Want debugging messages?
#br.set_debug_http(True)
#br.set_debug_redirects(True)
#br.set_debug_responses(True)
# User-Agent (this is cheating, ok?)
br.addheaders = [('User-agent', 'Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.1) Gecko/2008071615 Fedora/3.0.1-1.fc9 Firefox/3.0.1')]
r = br.open('http://www.example.com/html-page-with-dynamic-image-embedded.html')

# Check if HTML content returned ok
if br.response().info()['Content-Type'] == 'text/html; charset=iso-8859-1':
    # Now that the main page is loaded you can open the dynamic image
    r = br.open('http://www.example.com/images/image.php')

    # From here you just treat the image as you wish
    png = r.read()
    f = open('image-new-name.png', 'wb')
    f.write(png)
    f.close()  

