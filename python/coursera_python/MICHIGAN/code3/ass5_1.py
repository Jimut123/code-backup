import xml.etree.ElementTree as ET

#data = '''
#<person>
#  <name>Chuck</name>
#  <phone type="intl">
#     +1 734 303 4456
#   </phone>
#   <email hide="yes"/>
#</person>'''

data = '''
<commentinfo>
        <note> This file contains the sample data for testing</note>
        <comments>
        <comment>
                <name>Romainia</name>
                <count>97</count>
        </comment>
        <comment>
                <name>Laurie</name>
                <count>97</count>
        </comment>
        <comment>
                <name>Bayli</name>
                <count>90</count>
        </comment>
        <comment>
                <name>Siyona</name>
                <count>90</count>
                </comment>
        </comments>
</commentinfo>'''




tree = ET.fromstring(data)
lst = tree.findall('comments/comment')

print("count = ",len(lst))
s = 0
for item in lst:
	count = int(item.find('count').text)
	s = s + count

print("Sum : ",s)
#print('Name:', tree.find('name').text)
#print('Attr:', tree.find('email').get('hide'))

