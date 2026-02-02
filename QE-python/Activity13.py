def my_sum(numbers):
    total = 0
    for num in numbers:
        total += num
    print("The sum of the list is:", total)
user_input = input("Enter numbers separated by spaces: ")
numbers_list = [int(x) for x in user_input.split()]
my_sum(numbers_list)
