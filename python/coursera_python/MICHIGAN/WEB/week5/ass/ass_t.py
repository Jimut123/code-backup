import xml.etree.ElementTree as ET

input = '''
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



stuff = ET.formstring(input)
lst = stuff.findall('comments/comment')

print(lst)











