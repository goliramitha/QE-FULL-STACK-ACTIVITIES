from selenium import webdriver
from selenium.webdriver.common.by import By

# Create WebDriver
driver = webdriver.Chrome()
driver.maximize_window()

# 1. Open URL
driver.get("https://training-support.net/webelements/tables")

# 2. Print page title
print("Page Title:", driver.title)

# Locate the table
table = driver.find_element(By.XPATH, "//table")

# 3. Find number of rows
rows = table.find_elements(By.XPATH, ".//tbody/tr")
print("Number of Rows:", len(rows))

# 4. Find number of columns
columns = table.find_elements(By.XPATH, ".//thead/tr/th")
print("Number of Columns:", len(columns))

# 5. Print all cell values in the 3rd row
print("Values in 3rd Row:")
third_row = table.find_elements(By.XPATH, ".//tbody/tr[3]/td")
for cell in third_row:
    print(cell.text)

# 6. Print value at 2nd row and 2nd column
cell_value = table.find_element(By.XPATH, ".//tbody/tr[2]/td[2]")
print("Value at 2nd row 2nd column:", cell_value.text)

# 7. Close browser
driver.quit()