from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Open browser
driver = webdriver.Chrome()
driver.maximize_window()

# Open URL
driver.get("https://training-support.net/webelements/dynamic-controls")

# Print page title
print("Page Title:", driver.title)

wait = WebDriverWait(driver, 10)

# Find text field
text_field = driver.find_element(By.ID, "input-text")

# Check if text field is enabled (before)
print("Text field enabled before:", text_field.is_enabled())

# Click "Enable Input" button
enable_btn = driver.find_element(By.ID, "toggleInput")
enable_btn.click()

# Wait until input field is enabled
wait.until(lambda d: d.find_element(By.ID, "input-text").is_enabled())

# Check if text field is enabled (after)
text_field = driver.find_element(By.ID, "input-text")
print("Text field enabled after:", text_field.is_enabled())

# Close browser
driver.quit()