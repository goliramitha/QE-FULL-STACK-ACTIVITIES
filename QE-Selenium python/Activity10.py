from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
import time

driver = webdriver.Firefox()
driver.get("https://training-support.net/webelements/drag-drop")

print("Page Title:", driver.title)

actions = ActionChains(driver)

ball = driver.find_element(By.ID, "ball")
dropzone1 = driver.find_element(By.ID, "dropzone1")
dropzone2 = driver.find_element(By.ID, "dropzone2")

# Drag to Dropzone 1
actions.drag_and_drop(ball, dropzone1).perform()
time.sleep(1)

print("Dropzone 1 Text:", dropzone1.text)

# Drag to Dropzone 2
actions.drag_and_drop(ball, dropzone2).perform()
time.sleep(1)

print("Dropzone 2 Text:", dropzone2.text)

driver.quit()