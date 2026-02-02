from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

# Start Chrome
driver = webdriver.Chrome()
driver.get("https://training-support.net/webelements/dynamic-attributes")

print("Page Title:", driver.title)

wait = WebDriverWait(driver, 10)

# Wait for input fields
username = wait.until(
    EC.visibility_of_element_located((By.NAME, "username"))
)
password = wait.until(
    EC.visibility_of_element_located((By.NAME, "password"))
)

# Automatically fill details
username.send_keys("admin")
password.send_keys("password")

# Submit the form
submit_btn = wait.until(
    EC.element_to_be_clickable((By.XPATH, "//button[text()='Submit']"))
)
submit_btn.click()

# Wait for success message
success_msg = wait.until(
    EC.visibility_of_element_located((By.ID, "action-confirmation"))
)

print("Success Message:", success_msg.text)

driver.quit()
