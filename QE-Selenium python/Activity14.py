from selenium import webdriver
from selenium.webdriver.common.by import By
import time

# 1. Open Firefox browser
driver = webdriver.Firefox()
driver.maximize_window()

# 2. Open URL
driver.get("https://training-support.net/webelements/tables")

time.sleep(2)

# 3. Print page title
print("Page Title:", driver.title)

# Locate the table
table = driver.find_element(By.XPATH, "//table")

# 4. Find number of rows
rows = table.find_elements(By.XPATH, ".//tbody/tr")
print("Number of rows:", len(rows))

# Find number of columns
columns = table.find_elements(By.XPATH, ".//thead/tr/th")
print("Number of columns:", len(columns))

# 5. Print Book Name in 5th row (before sorting)
book_before_sort = driver.find_element(
    By.XPATH, "//table/tbody/tr[5]/td[2]"
)
print("Book Name in 5th row before sorting:",
      book_before_sort.text)

# 6. Click Price column header to sort
price_header = driver.find_element(
    By.XPATH, "//table/thead/tr/th[text()='Price']"
)
price_header.click()

time.sleep(2)

# 7. Print Book Name in 5th row again (after sorting)
book_after_sort = driver.find_element(
    By.XPATH, "//table/tbody/tr[5]/td[2]"A
)
print("Book Name in 5th row after sorting:",
      book_after_sort.text)

# 8. Close browser
driver.quit()