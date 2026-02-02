from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# Launch Firefox browser
driver = webdriver.Firefox()

# 1. Open the login page
driver.get("https://training-support.net/webelements/login-form")

# 2. Print the page title
print("Page Title:", driver.title)

# 3. Find username field and enter "admin"
driver.find_element(By.ID, "username").send_keys("admin")

# 4. Find password field and enter "password"
driver.find_element(By.ID, "password").send_keys("password")

# 5. Find and click the "Log in" button
driver.find_element(By.XPATH, "//button[text()='Log in']").click()

# Pause to see result
time.sleep(2)

# 6. Close the browser
driver.quit()
