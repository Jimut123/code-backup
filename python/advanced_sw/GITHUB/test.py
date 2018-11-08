import urllib.request, urllib.parse, urllib.error
from bs4 import BeautifulSoup
import ssl
import re
import sqlite3
import requests
import datetime
import os
import sys
import argparse
import random
import lxml.html as lh

import wget
from urllib.request import Request, urlopen
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE


r = requests.post("http://www.sxceducation.net/BABSC_CIA/CIAMARKS.aspx", data=dict(
    ddlSession="2017-2018",
    ddlSemester="Sem - IV",
    ddlStream="BSC",
    ddlDept="COMPUTER SCIENCE HONOURS",
    txtRoll="508"
))
print(r)
