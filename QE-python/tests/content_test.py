@pytest.fixture
def home_page_content():
    from bs4 import BeautifulSoup
    html = "<html><body><h1>Training Support</h1></body></html>"
    return BeautifulSoup(html, "html.parser")

def test_page_title(home_page_content):
    heading = home_page_content.find("h1")
    assert heading.text == "Training Support"
