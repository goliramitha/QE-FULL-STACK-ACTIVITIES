import pytest
@pytest.fixture(scope= class)
def input_value():
    return 12
def test_divisbility_by_2(input_value):
    assert input_value % 2 == 0
def test_divisbility_by_3(input_value):
    assert input_value % 3 == 0