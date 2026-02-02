from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Chrome()

# Open browser
driver.get("https://training-support.net/webelements/target-practice")

# Print page title
print("Title:", driver.title)

# Using XPath
third_header = driver.find_element(By.XPATH, "(//h3)[3]")
print("3rd Header Text:", third_header.text)

fifth_header = driver.find_element(By.XPATH, "(//h3)[5]")
print("5th Header Color:", fifth_header.value_of_css_property("color"))

# Using other locators
purple_button = driver.find_element(By.CLASS_NAME, "purple")
print("Purple Button Classes:", purple_button.get_attribute("class"))

slate_button = driver.find_element(By.CSS_SELECTOR, "button.slate")
print("Slate Button Text:", slate_button.text)

# Close browser
driver.quit()