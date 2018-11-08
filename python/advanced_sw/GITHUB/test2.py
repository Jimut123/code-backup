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
import lxml
import lxml.html as lh
from lxml import etree
import wget
from io import StringIO, BytesIO
from urllib.request import Request, urlopen
# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE
def gender_genie():
    url = 'http://www.sxceducation.net/BABSC_CIA/CIAMARKS.aspx'

    form_data = {
            'ddlSession':'2017-2018',
            'ddlSemester':'Sem - IV',
            'ddlStream':'BSC',
            'ddlDept':'COMPUTER SCIENCE HONOURS',
            'txtRoll':'508',
            'submit': 'btnViewCIA'
    }

    response = requests.post(url, data=form_data)

    tree = lh.document_fromstring(response.content)

    return tree


if __name__ == '__main__':
    lxmlc = gender_genie()
    print(lxml.html.tostring(lxmlc))
