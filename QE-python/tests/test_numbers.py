import pytest
@pytest.fixture
def numbers_list():
    return list(range(0,11))
def test_sum_of_numbers(numbers_list):
    assert sum(numbers_list)==55
    