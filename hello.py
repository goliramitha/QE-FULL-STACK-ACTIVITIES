from datetime import datetime

# Ask for user input
name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Get the current year
current_year = datetime.now().year

# Calculate the year the user will turn 100
year_turn_100 = current_year + (100 - age)

# Print the message
print(f"Hello {name}! You will turn 100 years old in the year {year_turn_100}.")
