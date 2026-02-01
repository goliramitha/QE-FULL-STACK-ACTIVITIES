numbers = []

n = int(input("How many numbers do you want to enter? "))

for i in range(n):
    num = int(input("Enter a number: "))
    numbers.append(num)

total = 0
for num in numbers:
    total += num

print("The sum of the list is:", total)
