from selenium.webdriver import Firefox
from selenium.webdriver.support.events import EventFiringWebDriver, AbstractEventListener
import time
from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.keys import Keys


class MyListener(AbstractEventListener):
    def before_navigate_to(self, url, driver):
        print("Before navigate to %s" % url)
    def after_navigate_to(self, url, driver):
        print("After navigate to %s" % url)

driver = Firefox()
ef_driver = EventFiringWebDriver(driver, MyListener())
ef_driver.get("https://zoom.earth/#-4.810966,32.244757,19z,sat")




try:
    browser.get(url)
    browser.get_screenshot_as_file(filename)
finally:
    browser.quit()