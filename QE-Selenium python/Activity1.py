from selenium import webdriver
from selenium.webdriver.firefox.service import Service
from selenium.webdriver.firefox.options import Options
from webdriver_manager.firefox import GeckoDriverManager
import time

options = Options()
# options.add_argument("--headless")  # optional

driver = webdriver.Firefox(
    service=Service(GeckoDriverManager().install()),
    options=options
)

# 1. Open site
driver.get("https://training-support.net")

# 2. Print title
print("Home Page Title:", driver.title)

# 3. Click About Us
driver.find_element("link text", "About Us").click()

time.sleep(2)

# 4. Print new page title
print("About Us Page Title:", driver.title)

driver.quit()
