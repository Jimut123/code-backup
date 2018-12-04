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
<note>This file contains the actual data for your assignment - good luck!</note>
<comments>
<comment>
<name>Aon</name>
<count>99</count>
</comment>
<comment>
<name>Eleni</name>
<count>99</count>
</comment>
<comment>
<name>Kit</name>
<count>95</count>
</comment>
<comment>
<name>Harjyot</name>
<count>95</count>
</comment>
<comment>
<name>Pieter</name>
<count>90</count>
</comment>
<comment>
<name>Romi</name>
<count>89</count>
</comment>
<comment>
<name>Lasse</name>
<count>89</count>
</comment>
<comment>
<name>Maros</name>
<count>85</count>
</comment>
<comment>
<name>Lexy</name>
<count>81</count>
</comment>
<comment>
<name>Richie</name>
<count>81</count>
</comment>
<comment>
<name>Abubakar</name>
<count>79</count>
</comment>
<comment>
<name>Brad</name>
<count>79</count>
</comment>
<comment>
<name>Wabuya</name>
<count>78</count>
</comment>
<comment>
<name>Seren</name>
<count>77</count>
</comment>
<comment>
<name>Gary</name>
<count>75</count>
</comment>
<comment>
<name>Dearbhla</name>
<count>75</count>
</comment>
<comment>
<name>Ericlee</name>
<count>73</count>
</comment>
<comment>
<name>Ada</name>
<count>73</count>
</comment>
<comment>
<name>Lucee</name>
<count>71</count>
</comment>
<comment>
<name>Pia</name>
<count>68</count>
</comment>
<comment>
<name>Matas</name>
<count>67</count>
</comment>
<comment>
<name>Kirwin</name>
<count>67</count>
</comment>
<comment>
<name>Dominic</name>
<count>65</count>
</comment>
<comment>
<name>Mirran</name>
<count>63</count>
</comment>
<comment>
<name>Merin</name>
<count>62</count>
</comment>
<comment>
<name>Haydon</name>
<count>61</count>
</comment>
<comment>
<name>Marwan</name>
<count>60</count>
</comment>
<comment>
<name>Daumantas</name>
<count>60</count>
</comment>
<comment>
<name>Sabrina</name>
<count>57</count>
</comment>
<comment>
<name>Tymoteusz</name>
<count>57</count>
</comment>
<comment>
<name>Umut</name>
<count>49</count>
</comment>
<comment>
<name>Billiejo</name>
<count>47</count>
</comment>
<comment>
<name>Clare</name>
<count>47</count>
</comment>
<comment>
<name>Sukhman</name>
<count>45</count>
</comment>
<comment>
<name>Aun</name>
<count>38</count>
</comment>
<comment>
<name>Jingyi</name>
<count>34</count>
</comment>
<comment>
<name>Frank</name>
<count>33</count>
</comment>
<comment>
<name>Jodie</name>
<count>29</count>
</comment>
<comment>
<name>Bayli</name>
<count>28</count>
</comment>
<comment>
<name>Hadiyah</name>
<count>28</count>
</comment>
<comment>
<name>Marla</name>
<count>27</count>
</comment>
<comment>
<name>Marcie</name>
<count>27</count>
</comment>
<comment>
<name>Jonny</name>
<count>26</count>
</comment>
<comment>
<name>Rhona</name>
<count>25</count>
</comment>
<comment>
<name>Ria</name>
<count>18</count>
</comment>
<comment>
<name>Alyssa</name>
<count>17</count>
</comment>
<comment>
<name>Letizia</name>
<count>11</count>
</comment>
<comment>
<name>Bekki</name>
<count>10</count>
</comment>
<comment>
<name>Yasemin</name>
<count>8</count>
</comment>
<comment>
<name>Martine</name>
<count>2</count>
</comment>
</comments>
</commentinfo>

'''





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

