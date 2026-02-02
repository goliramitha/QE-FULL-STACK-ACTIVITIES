from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.firefox.service import Service
from webdriver_manager.firefox import GeckoDriverManager
import time

driver = webdriver.Firefox(service=Service(GeckoDriverManager().install()))
driver.maximize_window()

driver.get("https://training-support.net/webelements/mouse-events")


print("Page Title:", driver.title)

actions = ActionChains(driver)

cargo_lock = driver.find_element(By.ID, "cargo-lock")
cargo_toml = driver.find_element(By.ID, "cargo-toml")
src = driver.find_element(By.ID, "src")
target = driver.find_element(By.ID, "target")
open_option = driver.find_element(By.ID, "open")


actions.click(cargo_lock).move_to_element(cargo_toml).click().perform()
time.sleep(1)
print("Output 1:", driver.find_element(By.ID, "result").text)


actions.double_click(src).perform()
time.sleep(1)


actions.context_click(target).click(open_option).perform()
time.sleep(1)
print("Output 2:", driver.find_element(By.ID, "result").text)

driver.quit()