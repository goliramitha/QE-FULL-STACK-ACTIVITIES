from selenium import webdriver
from selenium.webdriver.common.by import By

# Open browser
driver = webdriver.Chrome()
driver.maximize_window()

# Open URL
driver.get("https://training-support.net/webelements/dynamic-controls")

# Print page title
print("Page Title:", driver.title)

# Find checkbox
checkbox = driver.find_element(By.ID, "checkbox")

# Check if checkbox is selected (before click)
print("Checkbox selected before click:", checkbox.is_selected())

# Click checkbox
checkbox.click()

# Check if checkbox is selected (after click)
print("Checkbox selected after click:", checkbox.is_selected())

# Close browser
driver.quit()