from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://github.com/Jimut123")
#print(driver)

print(driver.title)
element = driver.find_element(by=By.ID, value="jump-to-results")
print(element)

follow = driver.find_elements(By.CLASS_NAME, "follow")
print(follow)