from selenium import webdriver
from selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait # available since 2.4.0
from selenium.webdriver.support import expected_conditions as EC # available since 2.26.0
from selenium.webdriver.support.ui import Select

driver = webdriver.Firefox()

driver.get("http://www.sxceducation.net/BABSC_CIA/CIAMARKS.aspx")

print ("Title : ",driver.title)

#element = driver.find_element_by_id("passwd-id")
element = driver.find_element_by_name("ddlSemester")

select.select_by_value("Sem - III")
#select = Select(driver.find_element_by_value('Sem - III'))
#select.select_by_visible_text("Select Session")


