import time
import sys
import os
from selenium import webdriver
driver = webdriver.Chrome("/usr/bin/firefox") #This will open a new Firefox window
username = sys.argv[1]
passw = sys.argv[2]
profilename = sys.argv[3]
driver.get('https://www.quora.com/profile/{}/followers'.format(profilename)) #This will open Sean's followers page
#Depending on if you use Firefox or not, you might have to log in
email = driver.find_elements_by_name('email')
password = driver.find_elements_by_name('password')
email[1].send_keys(username)
password[1].send_keys(passw)
button = driver.find_elements_by_css_selector('input[type="submit"]')
button[1].click()
time.sleep(5)

filename = time.strftime('%H_%M_%S-%d_%m_%Y',time.localtime())

follower_num = int(driver.find_element_by_css_selector('a[href="/profile/{}/followers"]'.format(profilename)).find_element_by_tag_name('span').text) #number of followers
elem = driver.find_elements_by_class_name('UserPagedListItem')
while(len(elem) < follower_num):
    time.sleep(2)
    driver.execute_script('window.scrollTo(0,document.body.scrollHeight)') #Scroll to the bottom to load the list
    elem = driver.find_elements_by_class_name('UserPagedListItem')
with open('followers_list_'+filename,'w') as f:
    for follower in elem:
        name = follower.find_element_by_class_name('ObjectCard-header').find_element_by_css_selector('a.user').text
        link = follower.find_element_by_class_name('ObjectCard-header').find_element_by_css_selector('a.user').get_attribute('href')
        f.write(name+':'+link+'\n')
driver.close()
last = ''
if os.path.isfile('last_backup'):
    with open('last_backup','r') as f:
        last = f.readline()
with open('last_backup','w') as f:
    f.write(filename)
if last == '':
    sys.exit(0)
print('Comparing {} with {}'.format(last,filename))
with open('followers_list_'+last,'r') as old,open('followers_list_'+filename,'r') as new:
    a,b = set(old),set(new)
    unfollow = a.difference(b)
    follow = b.difference(a)
    if len(follow) == 0:
        print('No new followers since last check')
    else:
        print('New followers:')
        for i in follow:
            print(i.strip())
    if len(unfollow) == 0:
        print('Nobody unfollowed you since last check')
    else:
        print('Unfollowers:')
        for i in unfollow:
            print(i.strip())
