import pytest
def add(a,b):
    return a+b
def subtrack(a,b):
    return a-b
def multiply(a,b):
    return a*b
def divide (a,b):
    if b==0:
        raise ValueError("cannot divide by zero")
    return a/b
def test_addition():
    assert add(2,3) == 5
def test_subtraction():
    assert subtrack(5,3)==2
def test_multiplication():
    assert multiply(4,3)==12
def test_division():
    assert divide(10,2)==5
def test_division_by_zero():
    with pytest.raises(ValueError):
        divide(5,0)
