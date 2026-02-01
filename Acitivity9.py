
list1_input = input("Enter numbers for the first list separated by spaces: ")
list1 = [int(x) for x in list1_input.split()]
list2_input = input("Enter numbers for the second list separated by spaces: ")
list2 = [int(x) for x in list2_input.split()]
new_list = [x for x in list1 if x % 2 != 0] + [x for x in list2 if x % 2 == 0]
print("The new list is:", new_list)
