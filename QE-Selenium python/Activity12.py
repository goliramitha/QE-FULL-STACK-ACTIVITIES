from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
driver.maximize_window()

try:
    driver.get("https://training-support.net/webelements/dynamic-content")
    print("Page Title:", driver.title)

    wait = WebDriverWait(driver, 10)

    click_me = wait.until(
        EC.element_to_be_clickable((By.XPATH, "//button[text()='Click me']"))
    )
    click_me.click()

    text_element = wait.until(
        EC.visibility_of_element_located((By.ID, "dynamicText"))
    )
    print("Displayed Text:", text_element.text)

finally:
    driver.quit()
