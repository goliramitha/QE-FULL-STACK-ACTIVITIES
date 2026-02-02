import pytest

@pytest.fixture
def input_value():
    return 6  

def test_divisibility_by_2(input_value):
    assert input_value % 2 == 0

def test_divisibility_by_3(input_value):
    assert input_value % 3 == 0



