user_input = input("Enter numbers separated by spaces: ")
numbers = [int(x) for x in user_input.split()]
if len(numbers) > 0 and numbers[0] == numbers[-1]:
    print(True)
else:
    print(False)
