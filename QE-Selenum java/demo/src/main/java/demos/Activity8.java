package demos;

public class Activity8 {
    from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.chrome.service import Service
import time

# Setup WebDriver
driver = webdriver.Chrome()
driver.maximize_window()

# Open URL
driver.get("https://www.hithips.com/training-support.net/webelements/mouse-events")

# Print page title
print("Page Title:", driver.title)

actions = ActionChains(driver)

# -------------------------------
# LEFT CLICK SEQUENCE
# -------------------------------

cargo_lock = driver.find_element(By.ID, "cargo-lock")
cargo_toml = driver.find_element(By.ID, "cargo-toml")

actions.click(cargo_lock).pause(1).move_to_element(cargo_toml).click().perform()

# Get confirmation text
confirmation1 = driver.find_element(By.ID, "result").text
print("Confirmation after cargo sequence:", confirmation1)

time.sleep(2)

# -------------------------------
# DOUBLE CLICK + RIGHT CLICK
# -------------------------------

are_button = driver.find_element(By.ID, "are")
target_bullseye = driver.find_element(By.ID, "target")

actions.double_click(are_button).perform()
time.sleep(1)

actions.context_click(target_bullseye).perform()
time.sleep(1)

# Click "Open" from context menu
open_option = driver.find_element(By.XPATH, "//li[text()='Open']")
open_option.click()

# Get confirmation text
confirmation2 = driver.find_element(By.ID, "result").text
print("Confirmation after double/right click sequence:", confirmation2)

# Close browser
time.sleep(2)
driver.quit()


}
