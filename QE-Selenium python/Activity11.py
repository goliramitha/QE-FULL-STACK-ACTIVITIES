from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

driver = webdriver.Firefox()
driver.maximize_window()

driver.get("https://training-support.net/webelements/dynamic-controls")

print("Page Title:", driver.title)

wait = WebDriverWait(driver, 10)

# Toggle button
toggle = wait.until(EC.element_to_be_clickable((By.ID, "toggleCheckbox")))

# Remove checkbox
toggle.click()
wait.until(EC.invisibility_of_element_located((By.ID, "checkbox")))
print("Checkbox removed")

# Add checkbox again
toggle.click()

# Wait and select checkbox
checkbox = wait.until(EC.element_to_be_clickable((By.ID, "checkbox")))
checkbox.click()
print("Checkbox selected")

# ⏳ Timeout to observe the page (5 seconds)
time.sleep(5)

driver.quit()