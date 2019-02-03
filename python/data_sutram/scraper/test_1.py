from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver import ActionChains

driver = webdriver.Firefox()
driver.get("http://www.google.com/")

driver.find_element_by_tag_name('body').send_keys(Keys.CONTROL + 't')
driver.find_element_by_tag_name('body').send_keys(Keys.CONTROL, 't')
ActionChains(driver).key_down(Keys.CONTROL).send_keys('t').key_up(Keys.CONTROL).perform()

driver.get('http://stackoverflow.com/')