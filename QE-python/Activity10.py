user_input = input("Enter numbers separated by spaces: ")
numbers = tuple(int(x) for x in user_input.split())
print("Numbers divisible by 5 are:")
for num in numbers:
    if num % 5 == 0:
        print(num)
